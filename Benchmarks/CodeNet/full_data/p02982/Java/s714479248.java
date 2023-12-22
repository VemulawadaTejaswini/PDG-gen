import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[][] xArr = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < D; k++) {
                xArr[i][k] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int h = 0; h < N; h++) {
            for (int i = h+1; i < N; i++) {
                double distance = 0;
                for (int k = 0; k < D; k++) {
                    distance += Math.pow(Math.abs(xArr[h][k] - xArr[i][k]), 2);
                }
                double result = Math.sqrt(distance);
                if (result == (int)result) count++;
            }
        }
        System.out.println(count);
    }
}