import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = Integer.parseInt(sc.next());
        // }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i + j >= n) {
                    break;
                }
                if (s.charAt(i) != s.charAt(i + j)){
                    continue;
                }
                for (int k = 1; k < n; k++) {
                    if (i + j + k >= n) {
                        break;
                    }
                    if (j == k) {
                        continue;
                    }
                    if (s.charAt(i) != s.charAt(i + j + k) && s.charAt(i + j) != s.charAt(i + j + k)) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}