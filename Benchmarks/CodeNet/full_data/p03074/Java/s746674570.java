N,K = map(int,input().split())
S = list(map(int,input()))
tmp = 1
nums = []
cont = 0
for s in S:
    if int(s) == tmp:
        cont += 1
    else:
        nums.append(cont)
        cont = 1
        tmp = 1 - tmp
if cont != 0:
    nums.append(cont)
if len(nums) % 2 == 0:
    nums.append(0)
ans = 0
lst = []
for i in range(0,len(nums),2):
    for j in range(i,min(i+K*2+1,len(nums))):
        ans += nums[j]
    lst.append(ans)
    ans = 0
print(max(lst))