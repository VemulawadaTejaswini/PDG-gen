import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        if (R - L >= 2019) {
            System.out.println(0);
        } else {
            for (int i = 0; i < 2019; i++) {
                int finalI = i;
                if (IntStream.range(L, R + 1).filter(x -> x % 2019 == finalI).count() != 0) {
                    list.add(i);
                    break;
                }
            }
            long result = list.get(0) * (list.get(0) + 1);
            System.out.println(result%2019);
        }
    }
}
