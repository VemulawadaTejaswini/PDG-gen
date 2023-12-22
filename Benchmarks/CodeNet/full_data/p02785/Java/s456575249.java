package BegginerContest153;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        if (k >= n) {
            System.out.println(0);
        } else {
            System.out.println(list.stream().sorted(Comparator.comparingInt(m -> m)).collect(Collectors.toList()).subList(0, n - k).stream().mapToInt(m -> m).sum());
        }
    }
}
