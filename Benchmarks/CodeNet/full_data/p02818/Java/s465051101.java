import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A , B ,K;
        A = sc.nextInt();
        B = sc.nextInt();
        K = sc.nextInt();
        while (K > 0) {
            if (A > 0) {
                A--;
                K--;
            }
            else if (A == 0 && B > 0) {
                B --;
                K --;
            }
            else if ( A == 0 && B == 0)
            {
                break;
            }
        }

        System.out.println( A + " " + B );
    }
}
