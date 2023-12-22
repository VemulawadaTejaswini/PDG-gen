import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<BigDecimal> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new BigDecimal(sc.next()));
        }
        list = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        Deque<BigDecimal> deque = new ArrayDeque<>();
        for (BigDecimal e : list) {
            deque.addFirst(e);
        }
        boolean flg = true;
        while (flg) {
            BigDecimal x = deque.removeLast();
            BigDecimal y = deque.removeLast();
            if (deque.isEmpty()) {
                flg = false;
            }
            deque.addFirst(x.add(y).divide(new BigDecimal("2"), 7, RoundingMode.HALF_EVEN));
        }

        System.out.println(deque.removeFirst().toPlainString());
        sc.close();
    }
}