from collections import Counter
n,*a = map(int,open(0).read().split())
c = Counter(a)
b = 0
for i in c.values():
  b+=i-1
if b%2 != 0:
  b+=1
print(n-b)