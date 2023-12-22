package atCoder.ABC122;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        String s = sc.next();

        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0 ; i < q ; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int[] a = new int[n];
        int[] b = new int[n + 1];
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            if (i < n- 2 && s.substring(i, i + 2).equals("AC")) {
                a[i + 1] = 1;
                sum += a[i + 1];

            }
            b[i + 1] = sum;
        }

        for (int i = 0 ; i < q ; i++) {
            System.out.println(b[r[i] -1 ] - b[l[i ] -1]);
        }



    }

}
