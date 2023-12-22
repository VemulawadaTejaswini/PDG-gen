import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(final String[] args) {
        try(final Scanner scanner = new Scanner(System.in);) {
            final int n = scanner.nextInt();
            final int[] allInput = IntStream.rangeClosed(1, n).map(i -> scanner.nextInt()).toArray();

            int[] judgeNumbers = allInput;
            int cnt = 0;
            // 全て偶数の場合、配列のすべての値を2で割る
            // この操作が何回できるのかカウントする
            while (Arrays.stream(judgeNumbers).allMatch(i -> i % 2 == 0)) {
                judgeNumbers = Arrays.stream(judgeNumbers).map(i -> i / 2).toArray();
                cnt++;
            }
            System.out.println(cnt);

        }
    }
}
