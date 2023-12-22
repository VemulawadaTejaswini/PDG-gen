import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] py = new int[m][3];

        for (int i = 0; i < m; i++) {
            py[i][0] = sc.nextInt();
            py[i][1] = sc.nextInt();
            py[i][2] = i;
        }

        py = Ssort(py);
        String[] re = new String[m];

        int cnt = 1;
        for (int i = 0; i < m; i++) {
            int a = py[i][0];
            int b = py[i][2];
            if (i >= 1) {
                int a1 = py[i-1][0];
                if (a == a1)
                    cnt++;
                else
                    cnt = 1;
            }
            re[b] = String.format("%06d%06d", a, cnt);
        }

        for (String s : re) {
            System.out.println(s);
        }
    }

    public static int[][] Ssort(int[][] aOrigin) {
        int[][] a = aOrigin.clone();
        for (int i = 0; i < a.length-1; i++) {
            int max = i;
            for (int j = i; j < a.length; j++) {
                if (a[max][0] < a[j][0]) {
                    max = j;
                }
            }
            int num1 = a[max][0];
            int num2 = a[max][1];
            int num3 = a[max][2];
            a[max][0] = a[i][0];
            a[max][1] = a[i][1];
            a[max][2] = a[i][2];
            a[i][0] = num1;
            a[i][1] = num2;
            a[i][2] = num3;
        }

        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (a[min][1] > a[j][1]) {
                    min = j;
                }
            }
            int num1 = a[min][0];
            int num2 = a[min][1];
            int num3 = a[min][2];
            a[min][0] = a[i][0];
            a[min][1] = a[i][1];
            a[min][2] = a[i][2];
            a[i][0] = num1;
            a[i][1] = num2;
            a[i][2] = num3;
        }

        return a;
    }
}
