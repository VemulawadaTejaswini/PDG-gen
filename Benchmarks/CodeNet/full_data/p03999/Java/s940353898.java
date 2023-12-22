
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long ans = IntStream.range(0, (int) Math.pow(2, S.length() - 1)).boxed().map(flag -> {
            List<Integer> indexes = flagToIndexes(flag, S.length() - 1);
            // System.out.println(indexes);
            return subs(indexes, S).stream().map(s -> Long.parseLong(s)).reduce(0L, (accm, x) -> accm + x);
        }).reduce(0L, (accm, x) -> accm + x);

        System.out.println(ans);
    }

    public static List<Integer> flagToIndexes(int flag, int length) {
        List<Integer> indexes = new ArrayList<>();
        indexes.add(0);
        for (int i : IntStream.range(0, length).toArray()) {
            if ((flag >> i) % 2 == 1) {
                indexes.add(i + 1);
            }
        }
        indexes.add(length + 1);
        return indexes;
    }

    public static List<String> subs(List<Integer> indexes, String str) {
        List<String> substrs = new ArrayList<String>();
        for (int i : IntStream.range(1, indexes.size()).toArray()) {
            substrs.add(str.substring(indexes.get(i - 1), indexes.get(i)));
        }
        return substrs;
    }
}