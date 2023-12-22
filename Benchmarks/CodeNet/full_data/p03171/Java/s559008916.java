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
                if (i == j) {
                     ans[i][j][0] = arr[i];
                    ans[i][j][1] = -arr[i];
                    continue;                }
                for (int k = 0; k < 2; k++) {
                    int o = k == 1 ? 0 : 1;
                    long a = 0;
                    if (i - 1 >= 0) {
                        a = ans[i - 1][j][o];
                    }
                    long b = 0;
                    if (j - 1 >= 0) {
                        b = ans[i][j - 1][o];
                    }

                    if (k == 0) {
                        if (i == 0) {
                            ans[i][j][k] = b + (long) arr[j];
                        } else if (j == 0) {
                            ans[i][j][k] = a + (long) arr[i];
                        } else {
                            ans[i][j][k] = Math.max(a + arr[i], b + arr[j]);
                        }
                    } else {
                        if (i == 0) {
                            ans[i][j][k] = b - (long) arr[j];
                        } else if (j == 0) {
                            ans[i][j][k] = a - (long) arr[i];
                        } else {
                            ans[i][j][k] = Math.min(a - arr[i], b - arr[j]);
                        }
                    }

                }
            }

        }
        System.out.println(ans[0][arr.length - 1][0]);

        // System.out.println(getXY(arr, 0, arr.length - 1, 0));
        // System.out.println(getXY2(arr, 0, arr.length - 1, 0, ans));
        // System.out.println(visited);

    }

    
}
