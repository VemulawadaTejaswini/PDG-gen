import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextLine());
        }
        List<String> distinctList = list.stream().distinct().sorted().collect(Collectors.toList());
        long max = 0;
        List<String> maxList = new ArrayList<>();
        for (String str : distinctList ){
            long c = list.stream().filter(f -> f.equals(str)).count();
            if (c > max) {
                maxList.clear();
                maxList.add(str);
                max = c;
            } else if (c == max) {
                maxList.add(str);
            }

        }
        maxList.forEach(System.out::println);
    }
}