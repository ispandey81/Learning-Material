using CSV, DataFrames, Base64
start_time = String[]
end_time = String[]
temp_store = String[]
text = String[]
episode = String[]
ids = Int64[]
encoded_images = String[]
open("friends.s01e02.720p.bluray.x264-psychd.srt") do file
    counter = 365
    for ln in eachline(file)
        if (startswith(ln, "00"))
            # println(split(ln, " -->")[1])
            push!(start_time, replace(split(ln, " --> ")[1], "," => "."))
            push!(end_time, replace(split(ln, " --> ")[2], "," => "."))
            push!(episode, "s01e02")
            counter += 1
            push!(ids, counter)
        else
            if (typeof(match(r"^[0-9]+$", ln)) == RegexMatch)
                continue
            else
                push!(temp_store, ln)
            end
        end
    end
end

function encode_images()
    filtered_array = filter(x -> endswith(x, "jpg"), readdir(join=true))
    for i in sort!(filtered_array, by=i -> parse(Int64, split(split(i, "_")[3], ".")[1]))
        file = open(i)
        encoded = base64encode(file)
        push!(encoded_images, encoded)
    end
    # df = DataFrame(encoded_image=encoded_images)
    # CSV.write("encoded_images.csv", df)
end

encode_images()

temp = join(temp_store, " ")
text = split(temp, "  ")


df = DataFrame(id=ids, episode=episode, start_time=start_time, end_time=end_time, text=text, image=encoded_images)
CSV.write("s01e02.csv", df)


# file_name = "friends_s01e01_720p_bluray_x264-sujaidr.mkv"
# file_prefix = "friends_s01e01_"
# for (i, j) in enumerate(start_time)
#     # println("$i $j")
#     cmd = `ffmpeg -i $file_name -vframes 1 -ss $j $file_prefix$i.png`
#     run(cmd)
# end