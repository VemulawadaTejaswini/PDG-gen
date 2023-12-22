import java.util.Arrays;
import java.util.Scanner;

class BIT{
    int N;
    long[] data;
    long inf = (long)1e9+7;
    
    public BIT(int n){
        N = n;
        data = new long[N+1];
        Arrays.fill(data,0);
    }

    public void add(int pos,long dat){
        for(int x = pos;x<=N; x += x&-x)data[x] = (data[x]+dat)%inf;
    }

    public long getSum(int pos){
        if(pos==0)return 0;
        long res = 0;
        for(int x = pos; x>0;x-=x&-x)res=(res+data[x])%inf;
        return res;
    }

}



class Main{

    static long A,B;
    static int N;
    static long[] S;
    static int findIndex(long s){
        int left=0;
        int right=N+1;
        while(right-left>1){
            int center = (left+right)/2;
            if(s-S[center] >=B)left=center;
            else right=center;
        }
        return left;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        A = scan.nextLong();
        B = scan.nextLong();
        S = new long[N+1];
        S[0]=Long.MIN_VALUE/3;
        for(int i=0;i<N;++i)S[i+1] = scan.nextLong();
        if(A>B){
            long a = A;
            A=B;
            B=a;
        }
        for(int i=0;i<N-1;++i)if(S[i+2]-S[i] < A){
                System.out.println(0);
                return;
        }
        long mod = (long)1e9+7;
        //1-index
        BIT bit = new BIT(N+1);
        bit.add(1, 1);
        bit.add(2,1);
        int leftindex = 0;
        for(int i=2;i<=N;++i){
            long delta = S[i]-S[i-1];
            if(delta < A){
                bit.add(i+1, (bit.getSum(findIndex(S[i])+1) - bit.getSum(leftindex)+mod)%mod);
                leftindex = i-1;
            }
            else if(delta < B){
                bit.add(i+1, (bit.getSum(findIndex(S[i])+1) - bit.getSum(leftindex)+mod)%mod);
            }
            else bit.add(i+1, (bit.getSum(i+1) - bit.getSum(leftindex) + mod)%mod);
        }
        System.out.println((bit.getSum(N+1) - bit.getSum(leftindex)+mod)%mod);
    }
}