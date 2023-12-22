import java.util.Arrays;
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
        System.out.println((DP(arr, N) == 0 ? "Second" : "First"));

    }

    public static int DP(int arr[], int N) {
        int ans[] = new int[N];
        ans[0] = 0;
        Arrays.sort(arr);
        int index = 0;
        for (int i = 1; i < ans.length; i++) {
            while (arr[index] <= i) {
                int oppo = ans[i - arr[index]];
                if (oppo == 0) {
                    ans[i] = 1;
                }
                index++;

            }
            index = 0;

        }
        return ans[N - 1];

    }

    public static int getWinner(int arr[], int N) {
        Arrays.sort(arr);
        int index = 0;
        int ans[][] = new int[N + 1][2];
        for (int i = 0; i < ans.length; i++) {
            if (i == 0) {
                ans[0][0] = 1;
                ans[1][0] = 0;
                continue;
            }
            if (index < arr.length && i == arr[index]) {
                ans[i][0] = 0;

                ans[i][1] = 1;
                index++;
                continue;

            }

            for (int j = 0; j < 2; j++) {

                ans[i][j] = -1;

            }
        }
        // for (int i = 0; i < ans.length; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(ans[i][j] + " ");
        // }
        // // System.out.println(" break");
        // }

        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < 2; j++) {
                index = 0;
                int tempAns = -1;
                int o = j == 1 ? 0 : 1;
                ans[i][j] = o;
                while (index < arr.length && i - arr[index] >= 0) {
                    tempAns = ans[i - arr[index]][o];
                    if (tempAns == j) {
                        ans[i][j] = j;
                        break;
                    }
                    index++;
                }

            }
        }

        // for (int i = 0; i < ans.length; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(ans[i][j] + " ");
        // }
        // System.out.println();
        // }

        return ans[ans.length - 1][0];

    }

}