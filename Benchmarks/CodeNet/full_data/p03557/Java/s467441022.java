from bisect import bisect_left, bisect_right

n = int(input())
an = list(map(int, input().split()))
bn = list(map(int, input().split()))
cn = list(map(int, input().split()))

an.sort()
bn.sort()
cn.sort()

cnt = 0

for b in bn:
    a = bisect_left(an,b)
    c = bisect_right(cn,b)
    cnt += a * (n-c)
print(cnt)