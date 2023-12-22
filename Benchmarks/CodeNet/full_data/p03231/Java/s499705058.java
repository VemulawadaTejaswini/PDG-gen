
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();

        int lcm = lcm(N, M);
        int n = lcm / N;
        int m = lcm / M;

        for (int i = 0; i < lcm; i++) {
            if (i % n == 0 && i % m == 0) {
                if (S.charAt(i/n) != T.charAt(i/m)) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(lcm);
    }

    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }


}
