import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m=1000000007;
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        long all= (npmodm_solve(2,N,m) - 1L + m) % m;        //2^N mod 10^9+7
        all -= Combi(N,A);
        all -= Combi(N,B);
        all += 2L * m;
        all%=m;
        pl(all);


    }
    public static void pl(Object o){
        System.out.println(o);
    }
    public static void p(Object o){
        System.out.println(o);
    }
    public static long Combi(int n,int r) {		// nCr
        long mod =1000000007L;
        if(r==0 || r==n) return 1L;

        if(r>n-r) {
            r=n-r;
        }

        int[] bunsi=new int[r];
        int[] bunbo=new int[r];

        for(int k=0; k<r; k++) {
            bunsi[k]=n-r+k+1;
            bunbo[k]=k+1;
        }

        for(int p=2; p<=r; p++) {
            int pivot=bunbo[p-1];
            if(pivot>1) {
                int offset=(n-r)%p;
                for(int k=p-1; k<r; k+=p) {
                    bunsi[k-offset]/=pivot;
                    bunbo[k]/=pivot;
                }
            }
        }

        long kotae=1;

        for(int k=0; k<r; k++) {
            if(bunsi[k]>1) {
                kotae*=bunsi[k];
                kotae%=mod;
            }
        }

        return kotae;
    }
    public static long npmodm_solve(long n,long p,long m) {		//n^p mod m

        long[] amari=new long[64];

        amari[0]=n%m;
        for(int i=0; i<62; i++) {
            amari[i+1]=amari[i]*amari[i]%m;
        }
        long tmp=p;
        int counter=0;
        long ans=1;
        while(tmp>0) {
            if(tmp%2==1) {
                ans=ans*amari[counter]%m;
                tmp/=2;
                counter++;
            }
            else {
                tmp/=2;
                counter++;
            }
        }
        return ans;
    }
}
