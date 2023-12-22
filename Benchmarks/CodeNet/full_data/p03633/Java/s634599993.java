
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        //long t[] = new long[n];
        int t[] = new int[n];
        for(int i = 0;i < n;i++){
            t[i] = scan.nextInt();
        }

        long ans = lcm(t[0], t[1]);
        for(int i = 2;i < n;i++){
            ans = lcm(ans, t[i]);
        }

        System.out.println(ans);
    }

    static long gcd (long a, long b){
        if(a%b == 0)return b;
        return gcd(b, a%b);
    }

    static long lcm(long a, long b){
        return a/gcd(a, b)*b;
    }
}
