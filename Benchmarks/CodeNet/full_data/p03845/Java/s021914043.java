

import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[100];
        int[][] b = new int[100][2];
        int N, M;
        N = scanner.nextInt();
        int  sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            b[i][0] = scanner.nextInt();
            b[i][1] = scanner.nextInt();
            //System.out.println("de = " + a[b[i][0] - 1 ]);
            System.out.println(sum - (a[b[i][0] - 1] - b[i][1]));
        }

    }





}


