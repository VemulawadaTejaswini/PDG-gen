a,b = [int(v) for v in input().split()]

d = a+b
e = a-b
f = a*b
print(max(max(d,e),f))