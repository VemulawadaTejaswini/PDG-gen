import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int d[] = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = in.nextInt();
        }

        while (true) {
            if (include(n, d)) n++;
            else break;
        }

        System.out.println(n);
    }

    static boolean include(int n, int ng[]) {
        while (n > 0) {
            int t = n & 1;
            for (int i = 0; i < ng.length; i++) {
                if (t == ng[i]) return true;
            }
            n /= 10;
        }

        return false;
    }
}