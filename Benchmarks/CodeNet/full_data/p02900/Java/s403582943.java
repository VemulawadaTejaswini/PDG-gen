import math
A, B = map(int, input().strip().split())

minAB = min(A,B);

hurui = [True] * (minAB+1)

upper = int(math.sqrt(minAB+1))
ans = 1
for i in range(2, upper+1):
    if not(hurui[i]):
        continue
    
    for j in range(2*i, minAB+1, i):
        hurui[j] = False
    
    if A % i == 0  and B % i == 0:
        ans += 1
        
print(ans)