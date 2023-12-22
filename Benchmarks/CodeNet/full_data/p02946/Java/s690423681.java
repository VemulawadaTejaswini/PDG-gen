import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        System.out.println(String.join(" ", IntStream.range(X - (K - 1), X + K).mapToObj(String::valueOf).collect(Collectors.toList())));
    }
}
