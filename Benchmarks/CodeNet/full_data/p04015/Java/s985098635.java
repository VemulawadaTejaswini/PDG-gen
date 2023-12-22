
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();

        List<Integer> smalls = new ArrayList<>();
        List<Integer> larges = new ArrayList<>();
        List<Integer> sames = new ArrayList<>();
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            int remain = data - a;
            if (remain > 0) {
                max += remain;
                larges.add(remain);
            } else if (remain < 0) {
                min += remain;
                smalls.add(-remain);
            } else {
                sames.add(remain);
            }
        }
        BigDecimal sameB = new BigDecimal(1);
        for (int i = 1; i <= sames.size(); i++) {
            sameB = sameB.add(count(sames.size(), i));
        }
        BigDecimal result = new BigDecimal(0);
        result = result.add(sameB).subtract(new BigDecimal(1));

        max = Math.min(max, -min);

        BigDecimal[][] cache2 = new BigDecimal[50][larges.size() + 1];
        BigDecimal[][] cache3 = new BigDecimal[50][smalls.size() + 1];

        for (int i = 1; i <= max; i++) {
            BigDecimal r = find(larges, 0, i, cache2);
            if (r.compareTo(new BigDecimal(0)) == 0) {
                continue;
            }
            BigDecimal r2 = find(smalls, 0, i, cache3);
            if (r2.compareTo(new BigDecimal(0)) == 0) {
                continue;
            }
            result = result.add(r.multiply(r2).multiply(sameB));
        }

        System.out.println(result);

    }

    static BigDecimal[][] cache = new BigDecimal[50][50];

    private static BigDecimal find(List<Integer> datas, int index, int target, BigDecimal[][] cache) {
        if (target == 0) {
            return new BigDecimal(1);
        }
        if (datas.size() == index) {
            return new BigDecimal(0);
        }

        if (cache[index][target] != null) {
            return cache[index][target];
        }

        BigDecimal r = new BigDecimal(0);
        Integer integer = datas.get(index);
        if (target - integer >= 0) {
            BigDecimal rr = find(datas, index + 1, target - integer, cache).add(
                    find(datas, index + 1, target, cache));
            cache[index][target] = rr;
            return rr;
        } else {
            BigDecimal rr = find(datas, index + 1, target, cache);
            cache[index][target] = rr;
            return rr;
        }
    }

    private static BigDecimal count(int c1, int c2) {
        int c3 = c1 - c2;
        c2 = Math.min(c2, c3);
        if (cache[c1][c2] != null) {
            return cache[c1][c2];
        }
        BigDecimal r = new BigDecimal(1);
        for (int i = 0; i < c2; i++) {
            r = r.multiply(new BigDecimal(c1 - i));
        }
        for (int i = 0; i < c2; i++) {
            r = r.divide(new BigDecimal(c2 - i));
        }
        return r;
    }
}