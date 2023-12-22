import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLong());
        }
        List<Long> productList = new ArrayList<>();
        for(int i = 0; i < list.size() - 1; i++) {
            Long base = list.get(i);
            List<Long> subList = list.subList(i + 1, list.size());
            subList.forEach(f -> productList.add(base * f));
        }
        List<Long> sortedList = productList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList.get(k - 1));
    }
}