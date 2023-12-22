import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        String s = sc.next();
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1];
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                ans[i]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            sb.append(ans[r - 1] - ans[l - 1]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}