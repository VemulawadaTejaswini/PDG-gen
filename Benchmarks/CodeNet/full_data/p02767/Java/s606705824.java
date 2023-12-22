import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int Xmax = 0;
        int Xmin = 1000;
        int Xsum = 0;
        for (int i = 0; i < N; i ++) {
            X[i] = sc.nextInt();
            Xsum += X[i];
            if (Xmax < X[i]) {
                Xmax = X[i];
            }
            if (X[i] < Xmin) {
                Xmin = X[i];
            }
        }
        sc.close();

        // int P = (Xmin + Xmax) / 2;
        int P = Xsum / N;
        int Power1 = 0;
        int Power2 = 0;
        for (int i = 0; i < N; i++) {
            Power1 += (X[i] - P) * (X[i] - P);
            Power2 += (X[i] - P - 1) * (X[i] - P - 1);
        }

        System.out.println(Math.min(Power1, Power2));
    }
}
