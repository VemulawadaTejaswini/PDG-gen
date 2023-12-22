import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] array = new int[2][N];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[][] arraySum = new int[2][N+1];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < N + 1; j++) {
                arraySum[i][j] = arraySum[i][j-1] + array[i][N-j];
            }
        }
        
        int count = array[0][0];
        for (int i = 0; i < N; i++) {
            boolean flag = false;
            if (flag == false) {
                if (arraySum[1][N-i] > arraySum[0][N-i-1]) {
                    count += array[1][i];
                } else {
                    count += array[0][i + 1];
                }
                if (i == N - 2) {
                    flag = true;
                }
            } else {
                count += array[1][i];
            }
        }

        System.out.println(count);

    }
}