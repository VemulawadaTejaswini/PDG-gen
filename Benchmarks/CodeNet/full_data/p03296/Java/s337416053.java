N = int(input())
a = list(map(int, input().split()))
cnt = 0

left = a[0]

for i in range(1,N):
    if  a[i] == left:
        a[i] += 1
        if not i == N and a[i] == a[i + 1]:
            a[i] += 1
        cnt += 1
    left = a[i]

print(cnt)