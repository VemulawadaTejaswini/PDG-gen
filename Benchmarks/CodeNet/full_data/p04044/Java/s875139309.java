import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int l = Integer.parseInt(scanner.next());

        IntStream.range(0, n)
                .mapToObj(v -> scanner.next())
                .sorted()
                .forEach(System.out::print);

        scanner.close();
    }
}