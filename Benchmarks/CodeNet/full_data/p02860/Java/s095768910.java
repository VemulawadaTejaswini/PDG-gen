N = gets.to_i
S = gets


if N % 2 == 1
  puts "No" 
  exit
end

str = S.slice(0, N/2)

puts S.include?(str*2) ? "Yes" : "No"

