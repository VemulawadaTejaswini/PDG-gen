import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - HonestOrUnkind2

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 人数
        int[] a = new int[n]; // 証言数
        int[][] x = new int[n][n]; // 誰に対して？
        int[][] y = new int[n][n]; // 証言
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0; j < a[i]; j++) {
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        //        System.out.println("x=" + Arrays.deepToString(x));
        //        System.out.println("y=" + Arrays.deepToString(y));

        ArrayList<int[]> ptn = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            setPtn(0, j, new int[n], ptn);
        }

        int max = 0;
        int count = 0;
        for (int[] idx : ptn) {
            //            System.out.println("idx=" + Arrays.toString(idx));
            count = 0;
            for (int i = 0; i < n; i++) {
                //                System.out.println("idx[i]=" + idx[i] + " (i=" + i + ")");
                if (idx[i] == 0) { // 不親切な人のときバイパス
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    //                    System.out.println("x[i][j]=" + x[i][j] + " (i=" + i + " ,j=" + j + ")");
                    //                    System.out.println("y[i][j]=" + y[i][j] + " (i=" + i + " ,j=" + j + ")");
                    if (x[i][j] == 0) {
//                        System.out.print("count:");
//                        System.out.println("idx=" + Arrays.toString(idx));
                        count++;
                        break;
                    } else {
                        //                        System.out.println("idx[x[i][j] - 1]=" + idx[x[i][j] - 1]);
                        if (idx[x[i][j] - 1] == y[i][j]) {
//                            System.out.println("x[i][j]=" + x[i][j] + " (i=" + i + " ,j=" + j + ")");
//                            System.out.println("y[i][j]=" + y[i][j] + " (i=" + i + " ,j=" + j + ")");
                        } else {
                            i = n;
                            count = 0;
                            break;
                        }
                    }
                }
            }
            if (max < count)
                max = count;
        }

        System.out.println(max);
    }

    static void setPtn(int d, int c, int[] idx, List<int[]> ptn) {
        idx[d] = c;
        if (idx.length - 1 > d) {
            for (int l = 0; l < 2; l++) {
                setPtn(d + 1, l, idx, ptn);
            }
        } else {
            int[] tmpidx = idx.clone();
            ptn.add(tmpidx);
        }
    }

}