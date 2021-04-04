using Base64, CSV, DataFrames
function encode_images()
    encoded_images = String[]
    filtered_array = filter(x -> endswith(x, "jpg"), readdir(join=true))
    for i in sort!(filtered_array, by=i -> parse(Int64, split(split(i, "_")[3], ".")[1]))
        file = open(i)
        encoded = base64encode(file)
        push!(encoded_images, encoded)
    end
    df = DataFrame(encoded_image=encoded_images)
    CSV.write("encoded_images.csv", df)
end

encode_images()