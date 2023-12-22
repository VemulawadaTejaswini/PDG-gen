import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), q = scanner.nextInt();
        String s = scanner.next();
        List<Integer> ac = new ArrayList<>();
        for (int i = 1; i < n; i++)
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C')
                ac.add(i);
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt(), r = scanner.nextInt();
            int l1 = IntStream.range(0, ac.size())
                    .filter(j -> l <= ac.get(j))
                    .findFirst()
                    .orElse(ac.size());
            int r1 = IntStream.range(l1, ac.size())
                    .filter(j -> r <= ac.get(j))
                    .findFirst()
                    .orElse(ac.size());
            System.out.println(r1 - l1);
        }
    }
}