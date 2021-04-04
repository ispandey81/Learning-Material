function populate_timeframes()
    array_of_timeframes = String[]
    open("friends.s01e02.720p.bluray.x264-psychd.srt") do file
        for ln in eachline(file)
            if (startswith(ln, "00"))
                # println(split(ln, " -->")[1])
                push!(array_of_timeframes, replace(split(ln, " -->")[1], "," => "."))
            end
        end
    end
end

# used for the very first iteration
# file_name = "friends_s01e01_720p_bluray_x264-sujaidr.mkv"
# file_prefix = "friends_s01e01_"
# for (i, j) in enumerate(array_of_timeframes)
#     # println("$i $j")
#     cmd = `ffmpeg -i $file_name -vframes 1 -ss $j $file_prefix$i.jpg`
#     run(cmd)
# end
function generate_screenshots()
    file_name = "friends_s01e02_720p_bluray_x264-sujaidr.mkv"
    file_prefix = "friends_s01e02_"
    counter = 365
    for i in array_of_timeframes
        counter += 1
        cmd = `ffmpeg -i $file_name -vframes 1 -ss $i $file_prefix$counter.jpg`
        run(cmd)
    end
end

populate_timeframes()

generate_screenshots()