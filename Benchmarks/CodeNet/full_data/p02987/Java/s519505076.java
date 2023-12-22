import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        String[] strings = string.split("");

        String ss = strings[0];

        Map<String,Integer> map = Arrays.asList(strings)
                .stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingInt( s -> 1)));
        
        if (map.size() == 2 && map.get(ss) == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}