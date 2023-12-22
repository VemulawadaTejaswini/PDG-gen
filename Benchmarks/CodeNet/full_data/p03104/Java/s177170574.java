

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long aa = a;
        long bb = b;
        int[][] c =  new int [2][45];
        int index = 0;
        while (index <= 44) {
            c[0][index] = (int) (a % 2);
            c[1][index] = (int) (b % 2);
            a /= 2;
            b /= 2;
            index++;
        }
        //奇数の数
        int d[] = new int[45];

        if (c[0][0] == 0 && c[1][0] == 0) {
            if ((bb - aa) % 4 == 0) {
                d[0] = 0;
            } else {
                d[0] = 1;
            }
        } else if (c[0][0] == 1 && c[1][0] == 1) {
            if ((bb - aa) % 4 == 0) {
                d[0] = 1;
            } else {
                d[0] = 0;
            }
        } else {
            if ((bb - aa) % 4 == 1) {
                d[0] = 1;
            } else {
                d[0] = 0;
            }
        }

        for (int i = 1 ; i < 45 ; i++) {
            int abit = c[0][i];
            int bbit = c[1][i];
            if (abit == 0 && bbit == 0) {
                d[i] = 0;
            } else if (abit == 1 && bbit == 1) {
                if (c[0][0] == c[1][0]) {
                    d[i] = 1;
                } else {
                    d[i] = 0;
                }
            } else if (abit == 1 && bbit == 0){
                if (c[0][0] == 0) {
                    d[i] = 0;
                } else {
                    d[i] = 1;
                }
            } else {
                if (c[1][0] == 0) {
                    d[i] = 1;
                } else {
                    d[i] = 0;
                }
            }

        }
        long ans = 0;
        long e = 1;
        for (int i = 0 ; i < 45 ; i++) {
            ans += e * d[i];
            e *= 2;
        }


        System.out.println(ans);
    }

}
