import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String INPUT = "";

    public static void main(String[] args) {
        InputStream is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());

        Scanner scanner = new Scanner(is);

        final int n = scanner.nextInt();
        final int total = scanner.nextInt();
        List<Pair> result = solve(n, total);
        if (result == null) {
            System.out.println("-1 -1 -1");
        } else {
            System.out.println(String.format("%d %d %d", result.get(0).count, result.get(1).count, result.get(2).count));
        }
    }

    static List<Pair> solve(int n, int total) {
        List<Integer> bills = new ArrayList<>();
        bills.add(10000);
        bills.add(5000);
        bills.add(1000);

        return recursion(n, total, total, n, bills, 0, new ArrayList<>());
    }

    static List<Pair> recursion(int n, int total, int remainingVal, int remainingCount, List<Integer> bills, int billPosition, List<Pair> acc) {
        if (billPosition == bills.size()) {
            // base case
            int billCount = acc.stream().mapToInt(x -> x.count).sum();
            int totalAccVal = acc.stream().mapToInt(x -> x.value * x.count).sum();
            if (totalAccVal == total && n == billCount) {
                return new ArrayList<>(acc);
            } else {
                return null;
            }
        }

        int currentBill = bills.get(billPosition);
        int billLimitForThis = remainingVal / currentBill;

        if (billLimitForThis > remainingCount) { // this can't be the candidate
            return null;
        }

        if (billPosition == bills.size() - 1) {
            // now, this is the last candidate. Check if currentBill * remainingCount == remainingVal
            acc.add(new Pair(currentBill, remainingCount));
            List<Pair> ret = recursion(n, total, remainingVal - currentBill * remainingCount, 0, bills, billPosition + 1, acc);
            acc.remove(acc.size() - 1);
            return ret;
        }

        for (int i = 0; i <= remainingCount && i <= billLimitForThis; i++) {
            acc.add(new Pair(currentBill, i));
            List<Pair> ret = recursion(n, total, remainingVal - currentBill * i, remainingCount - i, bills, billPosition + 1, acc);
            if (ret != null) {
                return ret;
            }
            acc.remove(acc.size() - 1);
        }
        return null;
    }

    static class Pair {
        int value;
        int count;

        Pair(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

}
