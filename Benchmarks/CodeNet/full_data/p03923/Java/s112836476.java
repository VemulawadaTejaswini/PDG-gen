import java.util.*;

class Main {
    static long p(long x,int k){
        long c=1;
        long lim=Long.MAX_VALUE/x;
        for(int j=0;j<k;++j){
            c*=x;
            if(c>=lim)return lim;
        }
        return c;
    }
    static long rt(long n,int e){
        long x=(long)Math.pow(n,1.0/e);
        long m=0;
        for(long i=Math.max(x-8,1);i<=x+8;++i){
            long c=p(i,e);
            if(c<=n)m=i;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n=scan.nextLong();
        long a=scan.nextLong();
        long m=n;
        for(int k=2;k<=40;++k){
            long x=rt(n,k);
            for(int b=0;b<=k;++b){
                long p=p(x,b),q=p(x+1,k-b);
                if(p>=(n+q-1)/q)
                    m=Math.min(m,x*b+(x+1)*(k-b)+(k-1)*a);
            }
        }
        System.out.println(m);
    }
}
