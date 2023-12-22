import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),
                M = in.nextInt(),
                Q = in.nextInt();
        int l, r;

        // input
        ArrayList<Integer>[] train = new ArrayList[N];
        IntStream.range(0, N).parallel().forEach(i->train[i] = new ArrayList<>());
        while (M-- > 0) {
            l = in.nextInt();
            r = in.nextInt();
            train[l - 1].add(r);
        }

        // sort
        Arrays.stream(train).parallel().forEach(e -> e.sort(null));

        // answering queries
        while (Q-- > 0) {
            l = in.nextInt();
            final int rf = in.nextInt();
            System.out.println(
                    IntStream.range(l - 1, rf)
                            .parallel()
                            .mapToLong(i -> {
                                int bs = Collections.binarySearch(train[i],rf);
                                return (bs<0 ? -1-bs : 1+bs);
                            })
                            .sum()
            );
        }

    }
}