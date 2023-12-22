
import java.util.*;

public class Main {
    int mod = 998244353;
    static int n;
    static int count = 0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        int[] re = method(a,b);
        // dump(a);
        // dump(b);
        // dump(re);
        if(check(a, re)){
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }
    }

    public static void dump(int[] p) {
        for(int i=0;i<n;i++){
            System.out.print(p[i] + " ");
        }
        System.out.println();
        return;
    }

    public static boolean check(int[] a, int[] b) {
        for(int i=0;i<n;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }

    static public int[] method(int[] a, int[] b) {
        int[] b_t = new int[n];
        boolean is = false;
        b_t = b;
        for(int i=n;i<a.length+n;i++){
            if(b_t[i%n] >= a[i%n]){
                int tmp = b_t[i%n]-b_t[(i-1)%n]-b_t[(i+1)%n];
                if(tmp>=a[i%n]){
                    b[i%n] = tmp;
                    count++;
                    is = true;
                }
            }
        }
        if(is)b_t = method(a, b_t);
        return b_t;
    }
}