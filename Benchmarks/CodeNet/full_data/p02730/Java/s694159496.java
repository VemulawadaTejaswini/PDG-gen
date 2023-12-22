import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(sc.next());
        // int m = Integer.parseInt(sc.next());
        String s = sc.next();
        int n = s.length();
        // int[] s = new int[n];

        // for (int i = 0; i < n; i++) {
        // s[i] = Integer.parseInt(sc.next());

        // }
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                flag = false;
                break;
            }
        }

        int m = (n - 1) / 2;
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != s.charAt(m - 1 - i)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}