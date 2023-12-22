import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - Stones

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();

        int min = n;
        int[] countB = new int[n + 1];
        int[] countW = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                countB[i] = countB[i - 1];
                if (c[i - 1] == '#') ++countB[i];
            } else {
                countB[i] = 0;
            }
        }

        for (int j = n; j >= 0; j--) {
            if (j < n) {
                countW[j] = countW[j + 1];
                if (c[j] == '.') ++countW[j];
            } else {
                countW[j] = 0;
            }
            if (min > (countB[j] + countW[j])) min = countB[j] + countW[j];
        }

        System.out.println(min);
    }
}
