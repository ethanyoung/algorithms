def solution(a)
  a.each_with_index do |n, i|
      return i if equilibrium_index i, a
  end
  return -1
end

def equilibrium_index(i, a)
  first_half =  if i == 0
                  []
                else
                  a[0 .. i - 1]
                end
  second_half = if i == a.size - 1
                  []
                else
                  a[i + 1 ..  -1]
                end
  sum_first = first_half.reduce 0, :+
  sum_second = second_half.reduce 0, :+
  sum_first == sum_second
end

a = [-1, 3, -4, 5, 1, -6, 2, 1]
b = [1, 1]

p solution(a)
