import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        List<Double> values = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .sorted()
                .collect(Collectors.toList());
        double tr = values.get(0);
        System.out.println(values.subList(1, size).stream()
            .reduce(tr, (a1, a2) -> (a1 + a2) / 2));
    }
}