n = gets.to_i

s = n.times.map{gets.split("").sort*""}
h = Hash.new(0)
ans = 0
s.each{|t|
  ans += h[t]
  h[t] += 1
}

p ans
