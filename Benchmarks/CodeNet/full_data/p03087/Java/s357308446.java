import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int q = std.nextInt();
        String s = std.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = std.nextInt() - 1;
            r[i] = std.nextInt() - 1;
        }

        String ac = "AC";
        int[] sum = new int[n];
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            char before = s.charAt(i - 1);
            if (before == 'A' && current == 'C') {
                sum[i] = sum[i - 1] + 1;
            } else {
                sum[i] = sum[i - 1];
            }
        }

        for (int i = 0; i < q; i++) {
            int count = sum[r[i]] - sum[l[i]];
            System.out.println(count);
        }
    }
}
