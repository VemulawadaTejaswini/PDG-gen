package reg.c80.D;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    private static String solve(Scanner scanner) {
        Main solver = new Main();
        int[][] ret = solver.solveInner(scanner);
        return solver.getRetString(ret);
    }

    private int[] a;
    private int ia;
    private int N;
    private int HW;

    private int[][] solveInner(Scanner scanner) {
        String line = scanner.nextLine();
        int H = Integer.parseInt(line.split(" ")[0]);
        int W = Integer.parseInt(line.split(" ")[1]);
        N = Integer.parseInt(scanner.nextLine());
        a = lineTointNums(scanner.nextLine());
        ia = 0;
        HW = H * W;

        int[][] ret =  new int[H][W];

        int rowMin = 1;
        int colMin = 0;
        int rowMax = H;
        int colMax = W;

        int colDir = 1;
        int rowDir = 0;

        int i = 0;
        int j = 0;

        while (true) {
//            if (rowMin == rowMax && colMin == colMax) break;

            mark(i, j, ret);
            HW --;
            if (HW == 0) return ret;

            j += colDir;
            i += rowDir;

            if (i == rowMax && rowDir == 1) {
                i--;
                j--;
                rowMax--;
                rowDir = 0;
                colDir = -1;
            } else if (j == colMax && colDir == 1) {
                j--;
                i++;
                colMax--;
                rowDir = 1;
                colDir = 0;
            } else if (i == rowMin - 1 && rowDir == -1) {
                i++;
                j++;
                rowMin++;
                rowDir = 0;
                colDir = 1;
            } else if (j == colMin - 1 && colDir == -1) {
                j++;
                i--;
                colMin++;
                rowDir = -1;
                colDir = 0;
            }

            System.out.println(getRetString(ret));
        }

//        return ret;
    }

    private String getRetString(int[][] ret) {
        StringBuilder sb = new StringBuilder();
        for (int[] row: ret) {
            for (int col: row) {
                sb.append(col);
            }
            sb.append("\n");
        }

        return new String(sb);
    }

    private void mark(int i, int j, int[][] ret) {
        if (a[ia] == 0) {
            ia ++;
        }
        ret[i][j] = ia + 1;
        a[ia] --;
    }

    public static void main(String[] args) {
//        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.println(solve(scanner));
    }

    private static String ex1 = "2 2\n" +
            "3\n" +
            "2 1 1";
    private static String ex2 = "3 5\n" +
            "5\n" +
            "1 2 3 4 5";
    private static String ex3 = "1 1\n" +
            "1\n" +
            "1";

    private static void tests() {
        System.out.println(solve(new Scanner(testCaseToInputStream(ex1))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex2))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex3))));
    }

    private static ByteArrayInputStream testCaseToInputStream(String ex) {
        try {
            return new ByteArrayInputStream(ex.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static int[] lineTointNums(String line) {
        String[] numStrs = line.split(" ");
        int[] nums = new int[numStrs.length];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        return nums;
    }
}
