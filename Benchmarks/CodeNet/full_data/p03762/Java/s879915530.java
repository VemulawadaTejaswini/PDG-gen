import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long mod=1000000007;
        long[] x=new long[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextLong();
        }
        long[] y=new long[m];
        for(int i=0;i<m;i++){
            y[i]=sc.nextLong();
        }
        long sumx=0;
        for(int i=0;i<n/2+1;i++){
            sumx+=Math.max((x[n-1-i]-x[i])*Math.abs(n-1-i*2),0);
            sumx%=mod;
        }
        long sumy=0;
        for(int i=0;i<m/2+1;i++){
            sumy+=Math.max((y[m-1-i]-y[i])*Math.abs(m-1-i*2),0);
            sumy%=mod;
        }
        System.out.println(sumx*sumy%mod);
    }
 
    
}