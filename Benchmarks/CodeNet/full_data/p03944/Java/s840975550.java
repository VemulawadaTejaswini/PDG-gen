import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        boolean[][] flag = new boolean[h][w];

        for (int i=0; i<n; i++) {
            if (arr[i][2] == 1) {
                for (int j=0; j<h; j++) {
                    for (int k=0; k<arr[i][0]; k++) {
                        flag[j][k] = true;
                    }
                }
            } else if (arr[i][2] == 2) {
                 for (int j=0; j<h; j++) {
                     for (int k=arr[i][0]; k<w; k++) {
                         flag[j][k] = true;
                     }
                 }
            } else if (arr[i][2] == 3) {
                for (int j=0; j<arr[i][1]; j++) {
                    for (int k=0; k<w; k++) {
                        flag[j][k] = true;
                    }
                }
            } else {
                for (int j=arr[i][1]; j<h; j++) {
                    for (int k=0; k<w; k++) {
                        flag[j][k] = true;
                    }
                }
            }
        }

        int cnt = 0;
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                if (flag[i][j]) cnt++;
            }
        }

        System.out.println(h * w - cnt);


    }
}

