import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int distinctsize = IntStream.range(0, n).mapToObj(m -> {
            char[] chars = sc.nextLine().toCharArray();
            return IntStream.range(0, chars.length).mapToObj(i -> String.valueOf(chars[i])).sorted().collect(Collectors.joining());
        }).collect(Collectors.toSet()).size();

        System.out.println(n - distinctsize);

    }
}
