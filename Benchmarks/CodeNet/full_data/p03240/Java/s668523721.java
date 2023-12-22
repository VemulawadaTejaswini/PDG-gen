import sys
n = int(input())
xyh = []
for _ in range(n):
	xyh.append(list(map(int,input().split())))

for Cx in range(101):
	for Cy in range(101):

		for x,y,h in xyh:
			if h == 0:
				continue

			H = h + abs(x - Cx) + abs(y - Cy)
			break
		ok = True
		for x,y,h in xyh:
			if H - abs(x - Cx) -abs(y - Cy) != h:
				ok = False
				break
		if ok:
			print("{} {} {}".format(Cx, Cy, H))
			sys.exit(0)

