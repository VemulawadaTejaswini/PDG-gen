import java.util.*;

public final class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        long[][] length = new long[N][N];

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                length[i][j] = s.nextLong();

            }
        }


        long result = 0;
        for (int i = 0; i < N;i ++) {

            for (int j = i+1; j< N; j++) {

                long dist = length[i][j];

                boolean flag = true;
                for (int k = 0; k < N; k++) {

                    if (k == i || k == j) continue;

                    long sum = length[i][k] + length[k][j];

                    if (sum < dist) {

                        System.out.print(-1);
                        return;
                    } else if (sum == dist) {

                        flag = false;
                    }
                }

                if (flag) result +=dist;
            }
        }

        System.out.print(result);
    }


}