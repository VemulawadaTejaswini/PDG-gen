import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] ds = new int[k];
        for (int i = 0; i < k; i++) {
            ds[i] = sc.nextInt();
        }

        while (true) {
            boolean notIncluded = true;
            for (int i = 0; i < k; i++) {
                if (String.valueOf(N).contains(String.valueOf(ds[i]))) {
                    notIncluded = false;
                }
            }

            if (notIncluded) {
                System.out.println(N);
                return;
            }
            N++;
        }

    }

}