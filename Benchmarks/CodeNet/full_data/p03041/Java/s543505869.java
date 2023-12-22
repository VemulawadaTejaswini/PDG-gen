import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int N = std.nextInt();
        int K = std.nextInt();
        String text = std.next();
        String[] splitText = text.split("");

        String result = IntStream.range(0, N).mapToObj(it -> {
            if (it == K - 1) {
                return splitText[it].toLowerCase();
            } else {
                return splitText[it];
            }
        }).collect(Collectors.joining());

        System.out.println(result);
    }
}
