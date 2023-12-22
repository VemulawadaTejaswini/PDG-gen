import java.util.*;

public class Main{
    static int n;
    static long m;
    static int v;
    static int p;
    static long[] a;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        m = Long.parseLong(sc.next());
        v = Integer.parseInt(sc.next());
        p = Integer.parseInt(sc.next());
        a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        
        Arrays.sort(a);
        //reverse
        for(int i=0; i<n/2; i++){
            long tmp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = tmp;
        }
        
        int ok = 0;
        int ng = n;
        for(int i=0; i<20; i++){
            int mid = (ok+ng)/2;
            if(check(mid)){
                ok = mid;
            }else{
                ng = mid;
            }
        }
        
        System.out.println(ok+1);
    }
    
    public static boolean check(int x){
        if(a[x]+m < a[p-1]){
            return false;
        }
        long sum = 0;
        for(int i=0; i<n; i++){
            if(i<p-1 || x<=i){
                sum+=m;
            }else{
                sum+=Math.max(a[x]+m-a[i], 0);
            }
        }
        
        return sum >= m*v;
    }
}
