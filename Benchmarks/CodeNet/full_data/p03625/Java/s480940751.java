num = int(input())

arr = {}
for i in input().split(" "):
	i = int(i)
	if arr.get(i, False):
		arr[i] += 1
	else:
		arr[i] = 1

arr = dict(sorted(arr.items(), key=lambda d: d[0], reverse=True))


side = []

for key in arr:
	if arr[key] >= 2:
		side.append(key)

if len(side) >= 2:
	print(side[0] * side[1])
elif len(side) == 1:
	print(side[0] * side[0])
else:
	print(0)
