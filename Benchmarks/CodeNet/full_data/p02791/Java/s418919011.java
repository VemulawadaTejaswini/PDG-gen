import sys

stdin = sys.stdin

ni = lambda: int(ns())
na = lambda: list(map(int, stdin.readline().split()))
ns = lambda: stdin.readline().rstrip()  # ignore trailing spaces

n = ni()
a = na()

mn = 9999999999
ct = 0
for i in range(n):
    if mn > a[i]:
        ct += 1
        mn = a[i]
print(ct)
