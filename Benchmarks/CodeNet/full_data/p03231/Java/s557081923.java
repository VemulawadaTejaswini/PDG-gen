import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();

        long lcm = lcm(N, M);
        int n = (int)(lcm / N);
        int m = (int)(lcm / M);
        int nm = n * m;
        for (int i = 0; i < lcm; i+=nm) {
            int in = i / n;
            int im = i / m;
            if (S.length() <= in || T.length() <= im) {
                break;
            }
            if (S.charAt(in) != T.charAt(im)) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(lcm);
    }

    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (long)(c/b);
    }


}
