import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        String[] na = new String[n];
        String[] ma = new String[m];
        for (int i = 0; i < n; i++) {
            na[i] = sc.next();
        }
        for (int i = 0; i < m; i++) {
            ma[i] = sc.next();
        }
        boolean ans = false;
        for (int i = 0; i <= n - m; i++) {
            int temp = i;
            for (int j = 0; j < m; j++) {
                if (na[temp].contains(ma[j])) {
                    temp++;
                    if (temp - i >= m) {
                        ans = true;
                    }
                } else {
                    break;
                }
            }
            if (ans) {
                break;
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}