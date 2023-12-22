import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        int cnt = 0;

        boolean flg = true;

        while (flg) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    a[i] /= 2;
                } else {
                    flg = false;
                    break;
                }
            }
            cnt++;
        }
        cnt--;
        System.out.println(cnt);
    }
}