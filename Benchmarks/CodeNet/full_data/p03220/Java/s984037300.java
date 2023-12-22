import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        double[] diff = new double[N];
        int minIdx = -1;

        for (int i = 0; i < N; i++) {
            double h = sc.nextDouble();
            double t = T - h * 0.006;
            diff[i] = Math.max(A, t) - Math.min(A, t);
        }

        int Idx = 0;
        double tmpDiff = 1e8;
        for (int i = 0; i < N; i++) {
            if (diff[i] < tmpDiff) {
                tmpDiff = diff[i];
                Idx = i;
            }
        }

        System.out.println(Idx + 1);
    }
}
