import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        Pattern pattern = Pattern.compile(IntStream.range(0, scanner.nextInt()).mapToObj(i -> Integer.toString(scanner.nextInt())).collect(Collectors.joining("", "[^", "]+")));
        IntStream.iterate(n, i -> ++i).filter(i -> pattern.matcher(Integer.toString(i)).matches()).findFirst().ifPresent(System.out::println);
    }
}