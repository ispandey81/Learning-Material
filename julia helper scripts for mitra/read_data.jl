using LibPQ, Tables, JSON3, Dates

mutable struct Subtitles
    id::Int64
    start_time::Dates.Time
    end_time::Dates.Time
    episode::String
    text::String
end

conn = LibPQ.Connection("dbname=postgres port=5432 host=127.0.0.1 user=postgres password=latino")
result = execute(conn, "SELECT * FROM friends_subtitles WHERE id = 1")
data = columntable(result)
println(JSON3.write(data, Subtitles))
# data = Strapping.construct(Subtitles, columntable(result))
# println(data)
# x = DBInterface.execute(DBInterface.prepare(getdb, "SELECT * FROM friends_subtitles WHERE id = ?"), (1,))
# println(x)
# # the same but asynchronously
# async_result = async_execute(conn, "SELECT typname FROM pg_type WHERE oid = \$1", ["16"])
# # do other things
# result = fetch(async_result)
# data = columntable(result)

close(conn)
