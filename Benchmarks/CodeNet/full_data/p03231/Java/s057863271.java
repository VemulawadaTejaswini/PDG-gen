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
        long n = lcm / N;
        long m = lcm / M;
        char[] sArray = S.toCharArray();
        char[] tArray = T.toCharArray();
        long nm = n * m;
        for (long i = 0; i < lcm; i+=nm) {
            if (sArray[i/n] != tArray[i/m]) {
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
