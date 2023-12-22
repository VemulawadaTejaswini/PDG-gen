import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            b[j] = sc.nextInt();
        }

        sc.close();

        if (a[0] < b[0] && a[0] % 2 == 0 && b[0] % 2 == 1) {
            a[0] = a[0] + 2;
            b[0] = b[0] + 1;
        }
        if (a[0] > b[0] && a[0] % 2 == 0 && b[0] % 2 == 1) {
            a[0] = a[0] + 2;
            b[0] = b[0] + 1;
        }

        for (int k = 0; k < n-1; k++) {
            if (a[k] == b[k]) {
                continue;
            }
            else if (a[k] < b[k]) {
                tmp = (b[k] - a[k]) / 2;
                b[k+1] += tmp;
            } else {
                tmp = (a[k] - b[k] / 2);
                a[k+1] += tmp;
            }
        }

        if (a[n-1] == b[n-1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}