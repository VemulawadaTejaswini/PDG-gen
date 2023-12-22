import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            long temp = 0;
            int x = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                temp += Math.abs(x - a[j]);
                x = a[j];
            }
            if (i == n - 1) {
                temp += Math.abs(a[n - 2]);
            } else {
                temp += Math.abs(a[n - 1]);
            }
            ans[i] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (long l : ans) {
            sb.append(l);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}