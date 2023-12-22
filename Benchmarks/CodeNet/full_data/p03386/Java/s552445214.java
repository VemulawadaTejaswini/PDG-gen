import sys

a,b,k=map(int,input().split())
list=[]
if (b-a)<=k*2:
	for l in range(b-a+1):
		print(l+a)
	sys.exit()
for i in range(a,a+k):
	list.append(i)
for j in range(b,b-k,-1):
	list.append(j)
list.sort()
for k in range(len(list)):
	print(list[k])