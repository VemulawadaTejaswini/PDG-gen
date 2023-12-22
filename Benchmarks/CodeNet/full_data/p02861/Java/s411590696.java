
import java.util.Scanner;

public class Main {

    static int[] x;
    static int[] y;
    static double sum = 0;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        x = new int[n];
        y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(scan.next());
            y[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }

        permutation(sb.toString(), "");

        System.out.println(sum / count);

    }

    private static void permutation(String q, String ans) {
        if (q.length() == 1) {
            String s = ans + q;
            for (int i = 0; i < s.length() - 1; i++) {
                int start = Integer.parseInt(s.substring(i, i + 1));
                int end = Integer.parseInt(s.substring(i + 1, i + 2));
                sum += Math.sqrt((x[start] - x[end]) * (x[start] - x[end]) + (y[start] - y[end]) * (y[start] - y[end]));
            }
            count++;
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
            }
        }
    }

}
