import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double p;
        double tmp = 0;
        double max = 0;
        ArrayList<Double> old = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (i > K) {
                tmp -= old.get(0);
                old.remove(0);
            }
            p = CalcEx(sc.nextDouble());
            tmp += p;
            if ((i >= K)) {
                if (tmp > max) {
                    max = tmp;
                }
            }
            old.add(p);
        }

        System.out.println(max);
    }

    public static double CalcEx(double p) {
        double result = 0;
        result = (p + 1) / 2;
        return result;
    }
}