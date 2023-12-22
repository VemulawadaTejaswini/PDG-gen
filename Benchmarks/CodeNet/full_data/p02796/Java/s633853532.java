
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<List<BigDecimal>> robots = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long l = sc.nextLong();

            BigDecimal xx = BigDecimal.valueOf(x);
            BigDecimal ll = BigDecimal.valueOf(l);

            robots.add(Arrays.asList(xx.subtract(ll), xx.add(ll)));
        }

        List<List<BigDecimal>> result = new ArrayList<>();
        result.add(robots.get(0));
        for (int i = 1; i < robots.size(); i++) {
            BigDecimal from = result.get(result.size() - 1).get(0);
            BigDecimal to = result.get(result.size() - 1).get(1);

            BigDecimal curL = robots.get(i).get(0);
            BigDecimal curR = robots.get(i).get(1);

            if (from.compareTo(curL) == -1 && curL.compareTo(to) == -1) {
                continue;
            }
            if (from.compareTo(curR) == -1 && curR.compareTo(to) == -1) {
                continue;
            }
            result.add(robots.get(i));
        }

        System.out.println(result.size());
    }

}