import heapq

n, m = [int(v) for v in input().split(' ')]

costs = []
links = []
for i in range(n):
    costs.append([0] * i)
    links.append(set())

for i in range(m):
    l, r, c = [int(v) for v in input().split(' ')]
    l -= 1
    r -= 1

    for j in range(l, r):
        for k in range(j + 1, r + 1):
            c0 = costs[k][j]
            if c0 == 0 or c0 > c:
                costs[k][j] = c
                links[k].add(j)


h = []
heapq.heappush(h, (0, n-1))
closed = n
while len(h) > 0:
    c0, n0 = heapq.heappop(h)
    if closed <= n0:
        continue
    closed = n0
    if n0 == 0:
        print(c0)
        exit()

    for n1 in links[n0]:
        c1 = costs[n0][n1]
        heapq.heappush(h, (c0 + c1, n1))

print("-1")

