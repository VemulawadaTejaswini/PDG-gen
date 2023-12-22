import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        int res = gcd(a[0],a[1]);
        
        for(int i = 2; i < n; i++){
            res = gcd(res, a[i]);
        }
        System.out.println(res);
    }
    
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }

}
