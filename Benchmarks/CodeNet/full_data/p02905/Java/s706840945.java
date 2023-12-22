MOD = 998244353
inv2 = inv(2i64)
n = read_line.to_i
a = read_line.split.map(&.to_i)
divisor = Array.new(a.max + 1) { Array(Int32).new(initial_capacity: 20) }
2.upto(divisor.size - 1) do |i|
  i.step(to: divisor.size - 1, by: i) do |j|
    divisor[j] << i
  end
end
sum = Array.new(divisor.size, 0i64)
sum2 = Array.new(divisor.size, 0i64)
sub = Array.new(divisor.size, 0i64)
a.each do |v|
  divisor[v].each do |i|
    sum[i] += v
    sum2[i] += v.to_i64 * v
  end
  sum[1] += v
  sum2[1] += v.to_i64 * v
end
ans = 0i64
(divisor.size - 1).downto(1) do |i|
  next if sum[i] == 0i64
  sum[i] %= MOD
  sum2[i] %= MOD
  cur = sum[i] * sum[i] - sum2[i]
  cur += MOD if cur < 0
  cur %= MOD
  cur *= inv2
  cur %= MOD
  cur *= inv(i.to_i64)
  cur += MOD - sub[i]
  cur %= MOD
  next if cur == 0i64
  ans += cur
  divisor[i].each do |d|
    next if d == i
    sub[d] += cur * i / d
    sub[d] %= MOD
  end
  sub[1] += cur * i
  sub[1] %= MOD
end
puts ans % MOD

def inv(v)
  pow(v, MOD - 2)
end

def pow(v, p)
  return 1 if p == 0
  return v if p == 1
  ret = pow(v, p / 2)
  ret *= ret
  ret %= MOD
  if p % 2 == 1
    ret *= v
    ret %= MOD
  end
  ret
end
