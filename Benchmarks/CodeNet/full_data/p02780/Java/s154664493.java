
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        BigDecimal max = BigDecimal.ZERO;
        BigDecimal tempMax = BigDecimal.ZERO;

        List<BigDecimal> stack = new ArrayList<BigDecimal>();

        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            int s = (int) ((0.5) * p * (p + 1));
            BigDecimal k = new BigDecimal(s).divide(new BigDecimal(p));
            stack.add(k);
            tempMax = tempMax.add(k);
            if (stack.size() > K) {
                tempMax = tempMax.subtract(stack.remove(0));
            }
            if (max.compareTo(tempMax) == -1) {
                max = tempMax;
            }
        }

        System.out.println(max);

        sc.close();
    }

}
