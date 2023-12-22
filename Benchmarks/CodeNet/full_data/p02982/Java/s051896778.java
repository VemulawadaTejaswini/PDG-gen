import java.util.Scanner;

public class Main {


    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[][] points = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                points[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                int sum = 0;
                for (int k = 0; k < D; k++) {
                    sum += Math.pow(points[i][k] - points[j][k], 2);
                }
                double distance = Math.sqrt(sum);
                //int distanceInt = (int)distance;
                double flooredDistance = Math.floor(distance);
                if (distance == flooredDistance) {
                    ans++;
                }

            }
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

