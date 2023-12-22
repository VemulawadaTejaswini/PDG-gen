import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int po[]=new int[n];
        int gcd1[]=new int[n];
        int gcd2[]=new int[n];
        for(int i=0;i<n;i++){
            po[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0)gcd1[0]=po[0];
            else{
                gcd1[i]=gcd(gcd1[i-1],po[i]);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1)gcd2[n-1]=po[n-1];
            else{
                gcd2[i]=gcd(gcd2[i+1],po[i]);
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(i==0)max=Math.max(max,gcd2[1]);
            else if(i==n-1)max=Math.max(max,gcd1[n-2]);
            else{
                max=Math.max(max,gcd(gcd1[i-1],gcd2[i+1]));
            }
        }
        
        System.out.println(max);
    }
    public static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}