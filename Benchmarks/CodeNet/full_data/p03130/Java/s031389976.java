import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }

        boolean result = list.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().noneMatch(x -> x.getValue() >= 3);
        System.out.print(result ? "YES" : "NO");
    }
}
