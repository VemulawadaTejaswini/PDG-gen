import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] ary = new long[n];
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            ary[i] = a;
        }
        boolean ans = true;;
        for (int i = 0; i < n - 1; i++) {
            if (n == 1) {
                break;
            }
            if (ary[i] > ary[i + 1]) {
                ary[i] = ary[i] - 1;
            }
        }
        if (ans) {
            for (int i = 0; i < n - 1; i++) {
                if (n == 1) {
                    break;
                }
                if (ary[i] > ary[i + 1]) {
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}