import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int acnt = 0;
        int bcnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= b[i]) {
                bcnt += a[i] - b[i];
            } else {
                if ((b[i] - a[i]) % 2 == 0) {
                    acnt += (b[i] - a[i]) / 2;
                } else {
                    acnt += (b[i] - a[i] + 1) / 2;
                    bcnt++;
                }
            }
        }
        if (acnt < bcnt) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
