import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] X = new int[N];
            int[] Y = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
                Y[i] = sc.nextInt();
            }

            double sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    sum += Math.sqrt(Math.pow(X[i] - X[j], 2) + Math.pow(Y[i] - Y[j], 2));
                }
            }

            double ave = sum * 2 / N;

            System.out.println(ave);
        }
    }

}
