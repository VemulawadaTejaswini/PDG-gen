import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            list.add(scan.nextInt());
            list.add(scan.nextInt());
        }

        Map<Integer, Long> map = list.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting()));
        boolean isYes = map.entrySet().stream().noneMatch(x -> x.getValue() >= 3);
        System.out.print(isYes ? "YES" : "NO");
    }
}
