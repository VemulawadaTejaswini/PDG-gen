
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x  =  sc.nextLong();

        long ans = 0;
        while (n >= 0) {
            long center = getCenter(n);
            if (x == getALL(n)) {
                ans += getAllP(n);
                break;
            }
            if (x == 1) {
                break;
            }
            if (x > center) {
                ans += getAllP(n - 1) + 1;
                x -= center;
                n--;
                if (x == 1) {
                    break;
                }
            } else if (x < center) {
                n--;
                x--;

            } else {
                ans += getAllP(n - 1) + 1;
                break;
            }
        }





        System.out.println(ans);
    }

    static long getAllP(int n ) {
        return (long) (Math.pow(2, n + 1) - 1);
    }
    static long getCenter(int n) {
        return (long) (Math.pow(2, n + 1) - 1);
    }
    static long getALL(int n) {
        return (long) (Math.pow(2, n + 2) - 3);
    }

}
