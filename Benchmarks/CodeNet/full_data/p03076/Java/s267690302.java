import numpy as np
A=int(input())
B=int(input())
C=int(input())
D=int(input())
E=int(input())
X = np.asarray([A,B,C,D,E])
X_div = X%10
X_sort = np.sort(X_div)
min=0
for i in range(5):
	if X_sort[i]!=0:
		min=X_sort[i]
		break
if min==0:
	min=10
X=10*((X-1)//10)+10

sum=0
for i in range(5):
	sum+=X[i]
print(sum-10+min)