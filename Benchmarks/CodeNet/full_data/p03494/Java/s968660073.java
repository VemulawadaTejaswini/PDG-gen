# 入力
n = int(input())
a = [int(num) for num in input().split()]

# 主処理
count = 0
isEven = True
while isEven:
  for num in a:
    isEven = num % 2 == 0 and isEven
  if isEven:
    a = [num/2 for num in a]
    count += 1

# 出力
print(count)
