import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }
        long ans[][][] = new long[arr.length][arr.length][2];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < 2; k++) {
                    ans[i][j][k] = Long.MIN_VALUE;
                }
            }
        }
        // System.out.println(getXY(arr, 0, arr.length - 1, 0));
        System.out.println(getXY2(arr, 0, arr.length - 1, 0, ans));
        // System.out.println(visited);

    }

   
   
    public static int visited = 0;

    public static long getXY2(int arr[], int start, int end, int p, long ans[][][]) {
        if (ans[start][end][p] != Long.MIN_VALUE) {
            visited++;
            return ans[start][end][p];
        }
        if (start == end) {
            if (p == 0) {
                ans[start][end][p] = arr[start];
                return arr[start];
            } else
                ans[start][end][p] = -arr[start];
            return -arr[start];
        }

        int o = (p == 1) ? 0 : 1;
        long op1 = getXY2(arr, start + 1, end, o, ans);
        long op2 = getXY2(arr, start, end - 1, o, ans);
        if (p == 0) {
            op1 += arr[start];
            op2 += arr[end];
            ans[start][end][p] = Math.max(op1, op2);
            return ans[start][end][p];
        } else {
            op1 -= arr[start];
            op2 -= arr[end];
            ans[start][end][p] = Math.min(op1, op2);

            return ans[start][end][p];
        }

    }
}
