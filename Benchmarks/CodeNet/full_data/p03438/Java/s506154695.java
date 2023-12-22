import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int suma = 0;
        int sumb = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            suma += a[i];
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            sumb += b[i];
        }

        int limit = Math.max(sumb - suma, 0);

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                cnt1 += a[i] - b[i];
            } else if (a[i] < b[i]) {
                cnt2 += (b[i] - a[i] + 1) / 2;
            }
        }

        System.out.println(cnt1 <= limit && cnt2 <= limit ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
