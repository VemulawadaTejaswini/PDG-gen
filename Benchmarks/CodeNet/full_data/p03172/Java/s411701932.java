import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int N = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(getWays(arr, N));

    }

    public static long getWays(int arr[], int N) {
        long ans[][] = new long[arr.length][N + 1];
        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 0; j < ans[0].length; j++) {
                if (i == arr.length - 1) {

                    if (j <= arr[i]) {
                        ans[i][j] = 1;
                    }
                    // continue;

                } else {

                    long ways = 0;
                    for (int k = 0; k <= arr[i]; k++) {
                        if (j >= k)
                            ways += ans[i + 1][j - k] % (1000000007);
                        else
                            break;
                    }
                    ans[i][j] = ways % (1000000007);

                }

            }
        }
        return ans[0][N];
    }
}
