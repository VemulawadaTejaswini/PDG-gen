import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            Pattern p = Pattern.compile("[753]");
            System.out.println(
                    IntStream.range(100, scanner.nextInt())
                            .parallel()
                            .mapToObj(String::valueOf)
                            .filter(s -> s.contains("7") && s.contains("5") && s.contains("3"))
                            .filter(s -> {
                                Matcher matcher = p.matcher(s);
                                return matcher.replaceAll("").isEmpty();
                            })
                            .count());
        }
    }
}