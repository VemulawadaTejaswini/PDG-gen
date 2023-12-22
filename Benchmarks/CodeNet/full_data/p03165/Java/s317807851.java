

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        Lcs(a, b);


    }


    public static void Lcs(String a, String b) {

        int n = a.length();
        int m = b.length();
        if(n==1 && m==1){

            if(a.charAt(n-1)==b.charAt(m-1)){
                System.out.println(a.charAt(n-1));
                return;
            }else{
                System.out.println("");
                return;
            }

        }
        n++;
        m++;
        int[][] t = new int[n][m];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }

            }
        }
        Print(t, a, b, n, m);
    }

    public static void Print(int[][] t, String a, String b, int n, int m) {

        StringBuilder sb = new StringBuilder();

        int i = n-1, j = m-1;
        while (i != 0 || j != 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                sb.append(a.charAt(i - 1));
                i--;
                j--;
            } else {
                if (t[i][j - 1] > t[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        System.out.println(sb.reverse().toString());
    }
}
