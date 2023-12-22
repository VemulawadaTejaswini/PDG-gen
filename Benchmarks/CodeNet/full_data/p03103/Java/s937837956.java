import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (x, y) -> x[0] - y[0]);

        long ret = 0;

        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i][1];
            if (m <= sum) {
                ret += (long)(m + arr[i][1] - sum) * arr[i][0];
                break;
            } else {
                ret += (long)arr[i][1] * arr[i][0];
            }
        }

        System.out.println(ret);

    }


}

