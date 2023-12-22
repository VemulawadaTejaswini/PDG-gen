from collections import deque

m,n = map(int,list(input().split()))

dirr = ((1,0),(0,1),(-1,0),(0,-1))


def valid(tmp,maze,seen):
    x = tmp[0]
    y = tmp[1]
    if x<0 or y<0 or x>=len(maze) or y>=len(maze[0]) or (tmp in seen) or maze[x][y] == '#':
        return False
    return True

def bfs(maze,i,j):    
    seen = {(i,j)}
    q = deque()
    q.append((i,j))

    tmpMoves = 0

    while q:
        gen = deque()
        while q:
            curr = q.pop()
            for d in dirr:
                x = curr[0]+d[0]
                y = curr[1]+d[1]
                tmp = (x,y)
                if valid(tmp,maze,seen):
                    gen.append(tmp)
                    seen.add(tmp)

        if not gen:break
        tmpMoves+=1        
        q = gen

    return tmpMoves
    

maze = [['.' for _ in range(n) ] for _ in range(m)]
for i in range(m):
    maze[i] = list(input())


max_moves = 0

for i in range(m):
    for j in range(n):
        if maze[i][j] == '#':continue
        ans = bfs(maze,i,j)        
        max_moves = max(ans,max_moves)

print(max_moves)
