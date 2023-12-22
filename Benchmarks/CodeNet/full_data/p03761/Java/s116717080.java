import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        List<String> list = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> list.add(sc.next()));

        int[] alpha = new int[26];
        Arrays.fill(alpha, 50);

        list.forEach(s -> {
            IntStream.rangeClosed('a', 'z').forEach(i ->
                alpha[i - 'a'] = (int) Math.min(alpha[i - 'a'], s.chars().filter(j -> j == i).count())
            );
        });

        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < alpha[i - 'a']; j++) {
                System.out.print(i);
            }
        }
    }
}