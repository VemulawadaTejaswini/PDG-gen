import sys
input = sys.stdin.buffer.readline
 
def main():
    a,b,c,d = map(int,input().split())
    MOD = 10**9+7
    N = c+d+5
    fac = [0 for _ in range(N+1)]
    fac[0],fac[1] = 1,1
 
    for i in range(2,N+1):
        fac[i] = (fac[i-1]*i)%MOD
        
    def comb(g,h):
        return (fac[g+h]*pow(fac[g],MOD-2,MOD)*pow(fac[h],MOD-2,MOD))%MOD
 
    print((comb(c+1,d+1)-comb(c+1,b)-comb(d+1,a)+comb(a,b))%MOD)
    
if __name__ == "__main__":
    main()