import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfPerson = scanner.nextLine();
        List<String> boss = Arrays.asList(scanner.nextLine().split(" "));
        Map<String, Integer> map = boss.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingInt(s -> 1)
                )
        );
        Map<String, Integer> treeMap = new TreeMap<>(map);
        for (Integer value : treeMap.values()){
            System.out.println(value);
        }
        System.out.println(0);

    }
}
