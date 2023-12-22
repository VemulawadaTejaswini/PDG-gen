import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final List<String> pattern = new ArrayList<>(Arrays.asList("Sunny", "Cloudy", "Rainy"));
            final String weather = sc.nextLine();
            final int newIndex = (pattern.indexOf(weather) + 1) % 3;
            System.out.println(pattern.get(newIndex));
        }
    }
}