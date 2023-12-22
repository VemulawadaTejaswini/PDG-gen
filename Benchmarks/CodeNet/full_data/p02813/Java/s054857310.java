
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final List<Integer> tmp = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toList());

        int index = 1;
        for (int i = 0; i < n; i++) {
            final int p = scanner.nextInt();
            final int pIndex = tmp.indexOf(p);
            if (pIndex != i) {
                index += kaizyou(n - i) * (pIndex - i);
            }
            tmp.remove(pIndex);
        }

        final List<Integer> hoge = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toList());

        int fuga = 1;
        for (int i = 0; i < n; i++) {
            final int p = scanner.nextInt();
            final int pIndex = hoge.indexOf(p);
            if (pIndex != i) {
                fuga += kaizyou(n - i) * (pIndex - i);
            }
            hoge.remove(pIndex);
        }

        System.out.println(Math.abs(fuga - index));
    }

    private static int kaizyou(final int i) {
        int result = 1;
        for (int j = 2; j < i; j++) {
            result *= j;
        }

        return result;
    }
}
