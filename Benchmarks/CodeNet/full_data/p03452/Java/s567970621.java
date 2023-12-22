pos = [[] for i in range(100000)]
por = [[] for s in range(200000)]
posvis = [1 for y in range(200000)]
qe = []
n, m = map(int, input().split())
for i in range(m):
    l, r, d = map(int, input().split())
    pos[l].append([r, d, i])
    pos[r].append([l, -d, i])
    qe.append([l, r, d])
 
 
def deep(self, vis=1):
    for j in pos[self]:
        if posvis[j[2]]:
            posvis[j[2]] = 0
            if vis:
                por[self] = [100000]
            if len(set(por[self])) > 1:
                print("No")
                exit()
                por[j[0]].append(por[self][0] + j[1])
            por[j[0]].append(por[self][0] + j[1])
            deep(j[0], 0)
for qww in qe:
    if posvis[qww[0]]:
        deep(qww[0])
for i in por:
    if i:
        if len(set(i)) > 1:
            print("No")
            exit()
else:
    print("Yes")
