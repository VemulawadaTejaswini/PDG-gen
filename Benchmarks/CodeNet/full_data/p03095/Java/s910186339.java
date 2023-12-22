import string
import re
n = int(input())
s = input()

total = 2**n-1
k = 0
for i in string.ascii_lowercase:
    c = s.count(i)
    if c > 1:
        l = 2**(n-c)
        total -= l
        k += c - 1

if k > 1:
    total += k

print(total)
