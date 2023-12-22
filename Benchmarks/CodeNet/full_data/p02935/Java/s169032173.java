import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        double[] v = new double[N];
        for (int i = 0; i < N; i++) {
            v[i] = Double.parseDouble(sc.next());
        }

        Arrays.sort(v);
        double res = (v[0] + v[1]) / 2;

        for (int i = 2; i < N; i++) {
            res = (res + v[i]) / 2;
        }
        System.out.println(res);
    }
}
