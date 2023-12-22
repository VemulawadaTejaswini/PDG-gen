import sys

stdin = sys.stdin

ni = lambda: int(ns())
na = lambda: list(map(int, stdin.readline().split()))
ns = lambda: stdin.readline().rstrip()  # ignore trailing spaces

n = ni()
b = na()

ans = 0
for i in range(n):
    q = 999999999
    if i > 0:
        q = min(q, b[i-1])
    if i < n-1:
        q = min(q, b[i])
    ans += q
print(ans)
