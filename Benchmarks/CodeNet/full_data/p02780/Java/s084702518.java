
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        double max = 0;
        double tempMax = 0;

        List<Double> stack = new ArrayList<Double>();

        for (int i = 0; i < N; i++) {

            int p = sc.nextInt();
            int s = (int) ((0.5) * p * (p + 1));

            double k = s / p;
            stack.add(k);

            tempMax = tempMax + k;

            if (stack.size() > K) {
                tempMax = tempMax - stack.remove(0);
            }

            if (max < tempMax) {
                max = tempMax;
            }
        }

        System.out.println(max);

        sc.close();
    }

}
