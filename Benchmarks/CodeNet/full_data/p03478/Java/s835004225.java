n, a, b = map(int, input().split())
ans = 0
for i in range(n+1):
  if a <= sum(list(map(int, list(str(i))))) <= b:
    ans += i
print(ans)