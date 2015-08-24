unless ARGV.size == 1
  abort 'format: words_count [input filename]'
end

input_filename = ARGV[0]

map = {}

File.open(input_filename).each_line do |line|
  words = line.split /\s+/
  words.each do |word|
    map[word] = 0 unless map[word]
    map[word] += 1
  end
end

puts map
