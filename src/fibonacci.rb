# Using the general formula to compute the nth fibonacci number.
include Math

def fib(n)
  fib = 1 / sqrt(5) * (((1 + sqrt(5)) / 2)**n - ((1 - sqrt(5)) / 2)**n)
  fib.to_i
end

n = ARGV[0].to_i
p fib(n)
