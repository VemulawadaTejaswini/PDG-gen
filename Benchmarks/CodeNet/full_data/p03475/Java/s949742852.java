
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] c;
    static int[] s;
    static int[] f;
    static int[] answer;
    static int[] min;


    public static void main(String[] args) {
        n = sc.nextInt();
        c = new int[n];
        s = new int[n];
        f = new int[n];
        min = new int[n];
        answer = new int[n];

        for (int i = 0; i < n - 1; i++) {
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(solve(i));
        }
    }

    private static int solve(int num) {
        if (num - 1 == n) {
            return 0;
        }
        int sum = 0;
        sum += s[num] + c[num];
        for (int i = num + 1; i < n - 1; i++) {
            sum += sum % f[i] + c[i];
        }
        return sum;

    }

    private static int min(int num) {
        if (num == n) {
            return 0;
        }
        return f[num] + c[num] + min(num + 1);
    }


}
