import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] digits = new int[n];
        Arrays.fill(digits, -1);
        int m = Integer.parseInt(stdIn.next());
        int[] s = new int[m];
        int[] c = new int[m];
        boolean check = true;
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(stdIn.next());
            c[i] = Integer.parseInt(stdIn.next());
            if (s[i] >= 1 && s[i] <= n && digits[s[i] - 1] == -1) {
                digits[s[i] - 1] = c[i];
            } else {
                check = false;
            }
        }
        if (digits[0] == -1) {
            digits[0] = 1; 
        }
        for (int i = 1; i < n; i++) {
            if (digits[i] == -1) {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0 || !check) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(digits[i]);
            }
            System.out.println();
        }
    }
}