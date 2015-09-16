def solution(a)
  left_sum = 0
  right_sum = a.reduce 0, :+

  a.each_with_index do |n, i|
    left_sum += a[i - 1] unless i == 0
    right_sum -= n
    return i if left_sum == right_sum
  end
  return -1
end

a = [-1, 3, -4, 5, 1, -6, 2, 1]
b = [1, 1]

p solution(a)
