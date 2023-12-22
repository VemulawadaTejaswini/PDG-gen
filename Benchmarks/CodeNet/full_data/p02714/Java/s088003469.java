n = gets.to_i
s = gets
ans = r = g = b = 0
0.upto(n-1) do |i|
  r += 1 if s[i] == "R"
  g += 1 if s[i] == "G"
  b += 1 if s[i] == "B"
  (i+1).upto(n-1) do |j|
    k = j + j - i
    if k < n && s[i] != s[j] && s[i] != s[k] && s[j] != s[k]
      ans += 1
    end
  end
end
puts (r * g * b - ans)