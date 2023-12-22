import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner("100000")) {
            int N = sc.nextInt();

            System.out.println(IntStream.range(1, N + 1).filter(i -> String.valueOf(i).length() % 2 == 1).count());
        }
    }

}
