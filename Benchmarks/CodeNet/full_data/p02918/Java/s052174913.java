import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();
        int challengeCount = std.nextInt();
        String text = std.next();
        List<String> directions = Arrays.asList(text.split(""));

        int unHappy = IntStream.range(0, directions.size())
                .reduce(0, (acc, index) -> {
                    if (index + 1 == directions.size()) {
                        return acc + 1;
                    }
                    String left = directions.get(index);
                    String right = directions.get(index + 1);
                    if (!left.equals(right)) {
                        return acc + 1;
                    } else {
                        return acc;
                    }
                });

        unHappy = (unHappy - 2 * challengeCount);
        if (unHappy <= 0) {
            unHappy = 1;
        }

        System.out.println(count - unHappy);
    }
}