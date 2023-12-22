import java.io.*;
import java.util.*;
public class Main {
    static long gcd(long a, long b){ return (b==0) ? a : gcd(b, a%b); }
    static int gcd(int a, int b){ return (b==0) ? a : gcd(b, a%b); }
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int a[] = new int[n];
        int i=1,pt=0;
        
        while(pt<n){
            if(lun(i)) a[pt++]=i;
            ++i;
        }
        System.out.println(a[n-1]);
    }
    static boolean lun(int n){
        int last = n%10;
        n/=10;
        while(n>0){
            if(Math.abs((n%10)-last)>1) return false;
            last = n%10;
            n/=10;
        }
        return true;
    }
}