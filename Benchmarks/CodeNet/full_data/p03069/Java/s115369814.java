import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char s[] = sc.next().toCharArray();
        sc.close();
        int a[][] = new int[n][2];
        if (s[0] == '.') {
            a[0][0] = 1;
        } else {
            a[1][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (s[i]=='.') {
                a[i][0] = a[i - 1][0] + 1;
                a[i][1] = a[i - 1][1];
            } else {
                a[i][0] = a[i - 1][0];
                a[i][1] = a[i - 1][1] + 1;
            }
        }
        int min = Math.min(a[n - 1][0], a[n - 1][1]);
        for (int i = 0; i < n; i++) {
            if (min > a[n - 1][0] - a[i][0] + a[i][1]) {
                min = a[n - 1][0] - a[i][0] + a[i][1];
            }
        }
        System.out.println(min);
    }
}