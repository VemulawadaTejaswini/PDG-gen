import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<Long> num = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            num.add(Long.parseLong(sc.next()));
        }

        for (int i = 0; i < m; i++) {
            long b = Long.parseLong(sc.next());
            long c = Long.parseLong(sc.next());
            for (int j = 0; j < b; j++) {
                num.add(c);
            }
        }

        long result = num.stream().sorted().skip(num.size() - n).mapToLong(l -> l).sum();
        System.out.println(result);
    }
}
