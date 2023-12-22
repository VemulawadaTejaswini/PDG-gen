import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        long c = 0;
        if(k % 2 == 0){
            long f1 = k / 2;
            if(f1 <= n) {
                long f2 = ((n - f1) / k + 1);
                c += f2 * f2 * f2;
            }
        }
        if(n >= k) {
            long f2 = ((n - k) / k + 1);
            c += f2 * f2 * f2;
        }
        System.out.println(c);
    }


}


