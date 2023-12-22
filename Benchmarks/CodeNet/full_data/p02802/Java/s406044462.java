import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[] p = new int[m];
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.next();
        }

        int clear = 0;
        int fault = 0;
        int[] flg = new int[n+1];
        int[] flgFault = new int[n+1];
        for (int i = 0; i < m; i++) {
            if (s[i].equals("AC") && flg[p[i]] != 1) {
                flg[p[i]] = 1;
                clear++;
            } else {
                if (s[i].equals("WA") && flg[p[i]] != 1) {
                    flgFault[p[i]]++;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (flg[i] == 1) {
                fault += flgFault[i];
            }
        }

        System.out.println(Integer.toString(clear) + " " + Integer.toString(fault));
    }
}