a,b,c=map(int,input().split())
cnt=0

if a==b==c and a%2==0:
  print(-1)
   
else:
  while a%2==0 and b%2==0 and c%2==0:
    a,b,c=(b+c)//2,(a+c)//2,(a+b)//2
    cnt+=1
  print(cnt)
