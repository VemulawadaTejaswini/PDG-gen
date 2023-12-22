import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        if(n-m >=2 || m-n >= 2) System.out.println(0);
        else {
            long a = 1;
            long b = 1;
            for(int i=n; i>=1; i--) {
                a *= i;
                a = a%1000000007;
            }
            for(int i=m; i>=1; i--) {
                b *= i;
                b = b%1000000007;
            }
            System.out.println((2*a*b) % 1000000007);
        }
        
    }

}
