import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        int aliceSum = IntStream.range(0, list.size()).filter(i -> i % 2 == 0).mapToObj(t -> list.get(t)).mapToInt(e -> e).sum();
        int bobSum = IntStream.range(0, list.size()).filter(i -> i % 2 == 1).mapToObj(t -> list.get(t)).mapToInt(e -> e).sum();
         System.out.println(aliceSum - bobSum);
    }
}
