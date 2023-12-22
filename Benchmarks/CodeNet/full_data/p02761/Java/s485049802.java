import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];
        for (int i = 0 ; i < m ; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        for (int i = 0 ; i < Math.pow(10, n) ; i++) {
            String x = String.valueOf(i);
            boolean flg = true;
            if (x.length() != n) {
                flg = false;
            }
            for (int j = 0 ; j < m ; j++) {

                if (x.length() < s[j]) {
                    flg = false;
                } else {
                    if (Integer.valueOf(x.substring(s[j] - 1, s[j])) != c[j]) {
                        flg = false;
                    }
                }
            }
            if (flg) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }

}