import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        List<Integer> dislikeList = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            dislikeList.add(Integer.parseInt(scanner.next()));
        }

        scanner.close();

        // n 以上の整数
        for (int i = N; i < 100000; i++) {
            boolean isCompleted = true;
            String tmp = String.valueOf(i);

            for (int j = 0; j < tmp.length(); j++) {
                int d = Integer.parseInt(String.valueOf(tmp.charAt(j)));
                if (dislikeList.contains(d)) {
                    isCompleted = false;
                    break;
                }
            }

            if (isCompleted) {
                System.out.println(i);
                return;
            }
        }
    }
}
