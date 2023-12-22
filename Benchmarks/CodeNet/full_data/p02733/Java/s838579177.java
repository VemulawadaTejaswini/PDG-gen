

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();

    char[][] arr = new char[h][w];

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) {
            arr[i] = sc.next().toCharArray();
        }

        int ans = Integer.MAX_VALUE;
        label:
        for (int i=0; i<1<<(h-1); i++) {
            int[][] a = new int[h][w];
            int varH = 0;
            int tmpAns = Integer.bitCount(i);
            for (int j=0; j<h; j++) {
                for (int l=0; l<w; l++) {
                    a[varH][l] += arr[j][l]-'0';
                }
                if ((i>>j & 1) == 1) {
                    varH++;
                }
            }
            int[] sum = new int[h];
            int front = 0;
            for (int j=0; j<w; j++) {
//                inner:
                for (int l=0; l<h; l++) {
                    sum[l] += a[l][j];
                    if (sum[l]>k) {
                        if (j==front) {
                            continue label;
                        }
                        front = j;
                        Arrays.fill(sum, 0);
                        tmpAns++;
                        j--;
//                        break ;
                    }
                }
            }
//            out.println(tmpAns);
//            out.flush();
            ans = Math.min(ans, tmpAns);
        }

        out.println(ans);
        out.flush();
    }
}
