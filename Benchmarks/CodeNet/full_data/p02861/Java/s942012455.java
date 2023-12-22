import java.util.*;

public class Main {
    static double result = 0;
    static int count = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i] = new int[] {input.nextInt(), input.nextInt()};
        }
        perm(arr, new boolean[N], 0, 0, null);
        System.out.println(result/count);
    }

    static void perm(int[][] arr, boolean[] bt, double sum, int cNum, int[] prev) {
        if (cNum == arr.length) {
            result += sum;
            count++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!bt[i]) {
                bt[i] = true;
                if (cNum == 0 && prev == null) perm(arr, bt, sum, cNum+1, arr[i]);
                else perm(arr, bt, sum + distance(prev, arr[i]), cNum+1, arr[i]);
                bt[i] = false;
            }
        }
    }

    public static double distance(int[] p1, int[] p2){
        return Math.sqrt(Math.pow(Math.abs(p1[0] - p2[0]), 2) + Math.pow(Math.abs(p1[1] - p2[1]), 2));
    }
}