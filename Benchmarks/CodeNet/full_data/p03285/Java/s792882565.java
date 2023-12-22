n=int(input())
#4
#7
ans=False
if n%7==0:
    ans==True


for i in range(n/7):
    if (n-i*7)%4==0:
        ans=True
        

if ans:
    print("Yes")
else:
    print("No")    
