n,k=map(int,input().split())
a=[]


for i in range(n):
    s,p=map(int,input().split())
    a+=[[s, p] ]
    

import operator as op
a.sort(key = op.itemgetter(0))

ans=0
get=0
look=0
while get<k:
    get=get+1
    a[look][1]=a[look][1]-1
    ans=ans+a[look][0]
    if a[look][1]==0:
        look=look+1

print(ans)