a,b,c = map(int, input().split())

for i in range(100):
    if a%2==1 or b%2==1 or c%2==1:
        break
    a, b, c = (a+b)//2,(b+c)//2,(c+a)//2
ans = i
if i == 99:
    ans = -1
print(ans)
