import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double[] EList = new double[N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            double e = (1.0 + num) / 2;
            EList[i] = e;
        }
        double sum = 0;
        double max = 0;
        for (int i = 0; i <= N - K; i++) {
            for (int j = 0; j < K; j++) {
                sum = sum + EList[i+j];
            }
            max = Math.max(sum, max);
            sum = 0;
        }
        System.out.println(max);
    }
}