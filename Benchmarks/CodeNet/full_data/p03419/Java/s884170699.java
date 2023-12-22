import java.util.*;

public class Main {

    private int N;
    private int M;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
    }

    public void printAnswer() {
        int[][] tile = new int[N+2][M+2];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                tile[i][j] = (tile[i][j] + 1) % 2;
                tile[i-1][j] = (tile[i-1][j] + 1) % 2;
                tile[i-1][j-1] = (tile[i-1][j-1] + 1) % 2;
                tile[i][j-1] = (tile[i][j-1] + 1) % 2;
                tile[i+1][j-1] = (tile[i+1][j-1] + 1) % 2;
                tile[i+1][j] = (tile[i+1][j] + 1) % 2;
                tile[i+1][j+1] = (tile[i+1][j+1] + 1) % 2;
                tile[i][j+1] = (tile[i][j+1] + 1) % 2;
                tile[i-1][j+1] = (tile[i-1][j+1] + 1) % 2;
            }
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                count += tile[i][j];
            }
        }
        System.out.println(count);
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
