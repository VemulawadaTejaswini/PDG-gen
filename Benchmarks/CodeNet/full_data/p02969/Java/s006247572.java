a = []
t = int(input())
for i in range(t):
    a.append(int(input()))

for i in range(t):
    b = a[i]
    del a[i]
    print(max(a))
    a.insert(i,b)