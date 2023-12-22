import sys
from collections import Counter

#[(105, 3), (120, 1), (106, 1), (119, 1)]
def selection(l1, l2, x ,y):
    
    #print('{}, {}'.format(x, y))
    
    #x yがlengthを超えたとき
    if x >= len(l1) or y >= len(l2):
        return x - 1, y - 1
    
    #それぞれの出現値が同じ場合
    if l1[x][0] == l2[y][0]:
            
        #出現回数が同じとき
        if l1[x][1] == l2[y][1]:
            return selection(l1, l2, x + 1 , y + 1)
    
    #出現回数を比較
    if l1[x][1] > l2[y][1]:
        return x , y - 1
        
    if l1[x][1] < l2[y][1]:
        return x - 1  , y
    
    return x, y

def main():
    input = sys.stdin.readline
    
    n = int(input())
    if n == 0 : return 0
    
    m = [int(i) for i in input().split()]
    
    even = [m[i] for i, _ in enumerate(m) if i % 2 == 0]
    odd = [m[i] for i, _ in enumerate(m) if i % 2 == 1]
    
    even_c = Counter(even).most_common()
    odd_c = Counter(odd).most_common()
    
    #print(even_c)
    #print(odd_c)
    
    e, o = selection(even_c, odd_c, 0 ,0)
    
    e = 0 if e < 0 else e
    o = 0 if o < 0 else o
    
    #print('{}, {}'.format(e, o))
    
    #全部ばらばら
    if (even_c[e][1] + odd_c[o][1] == 2):
        
        #0にならない
        ans = len(m) - 2
        ans = 1 if ans == 0 else ans
        print(ans)
        return
    
    #全部一緒
    if even_c[e][1] == odd_c[o][1] and even_c[e][0] == odd_c[o][0]:
        print(len(m) - even_c[e][1])
        return
    
    print( len(m) - (even_c[e][1] + odd_c[o][1]) )
    
    
if __name__ == '__main__':
    main()
    