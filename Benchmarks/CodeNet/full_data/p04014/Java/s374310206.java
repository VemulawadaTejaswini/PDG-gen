n = int(input())
s = int(input())
d = 0
k = 1
while k*k <= n-s:
  if (n-s)%k > 0:
    k += 1
    continue
  l = (n-s)//k
  if (l+1)*(l+1) > n:
    b = l+1
    if n//b + n%b == s:
      d = b
  b = k+1
  a = 0
  r = n
  while r > 0:
    a += r%b
    r = r//b
  if a == s:
    print(b)
    exit()
  k += 1
if n == s:
  print(n+1)
elif d>0:
  print(d)
else:
  print(-1)