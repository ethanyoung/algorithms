unless ARGV.size == 1
  abort 'format: words_count [input filename]'
end

def count_word(map, word)
  map[word] = 0 unless map[word]
  map[word] += 1
end

def count_line_of_words(map, line)
  words = line.split /\s+/
  words.each { |word| count_word map, word }
end

input_filename = ARGV[0]

map = {}

File.open(input_filename).each_line { |line| count_line_of_words map, line }

puts map

