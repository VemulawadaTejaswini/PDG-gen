import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        List<String> arr = Arrays.asList(args).stream().sorted().collect(Collectors.toList());
        String output = arr.get(0).equals("5") && arr.get(1).equals("5") && arr.get(2).equals("7") ? "YES" : "NO";
        System.out.println(output);
    }
}