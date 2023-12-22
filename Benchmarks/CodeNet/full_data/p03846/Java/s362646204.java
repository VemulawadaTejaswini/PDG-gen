import java.util.*;
 
public class Main {
    static int N;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int [] A = new int [N];
        for(int i=0; i<N; i++){
            A[sc.nextInt()]++;
        }
        long ans = cal(A);
        System.out.println(ans);
    }
    static boolean check(int [] A){
        if(N%2==0){
            for(int k=1; k<N; k+=2){
                if(A[k]!=2)return false;
            }
        }else{
            if(A[0]!=1)return false;
            for(int k=2; k<N; k+=2){
                if(A[k]!=2)return false;
            }
        }
        return true;
    }
    static long cal(int [] A){
        if(!check(A)){
            return 0;
        }else{
            return pow(2,N/2);
        }
    }
    static long pow(long a, long x){
        long mod = 1000000007;
        if(a==1||x==0)return 1;
        if(x%2==0){
            return pow(a*a%mod,x/2)%mod;
        }else{
            return a*pow(a,x-1)%mod;
        }
    }
}