import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arraySum = new int[2][N + 1];
        int[] array = new int[N];

        arraySum[0][1] = sc.nextInt();

        for (int j = 2; j < (N + 1); j++) {
            arraySum[0][j] = sc.nextInt() + arraySum[0][j - 1];
        }

        for (int j = N - 1; j >= 0; j--) {
            array[j] = sc.nextInt();
        }

        arraySum[1][N-1] = array[N-1];
        for (int i = N - 2; i >= 0; i--) {
            arraySum[1][i] = arraySum[1][i+1] + array[i];
        }

        int max = 0;
        int tmp = 0;
        for (int i = 1; i < N+1; i++) {
            tmp = arraySum[0][i] + arraySum[1][i - 1];
            if (max < tmp) {
                max = tmp;
            }
        }
        

        System.out.println(max);
    }
}