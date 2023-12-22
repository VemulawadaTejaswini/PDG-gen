
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final Deque<Integer>[] combination = new Deque[n];
        final LinkedList<Integer> indexList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            indexList.add(i);
            combination[i] = new ArrayDeque<>();
            for (int j = 0; j < n - 1; j++) {
                combination[i].add(scanner.nextInt() - 1);
            }
        }

        final Iterator<Integer> iterator = indexList.iterator();
        int counter = 0;
        while (true) {
            counter++;

            final boolean[] isAbleToSkip = new boolean[n];
            boolean doneOnceFlag = false;
            while (iterator.hasNext()) {
                final int index = iterator.next();
                if (combination[index].isEmpty()) {
                    iterator.remove();
                    continue;
                }
                if (isAbleToSkip[index]) {
                    continue;
                }

                final int opponent = combination[index].getFirst();
                if (isAbleToSkip[opponent]) {
                    continue;
                }

                if (combination[opponent].getFirst() == index) {
                    combination[index].removeFirst();
                    isAbleToSkip[index] = true;
                    isAbleToSkip[opponent] = true;
                    doneOnceFlag = true;
                }
            }

            if (indexList.isEmpty()) {
                System.out.println(counter - 1);
                return;
            }

            if (!doneOnceFlag) {
                System.out.println(-1);
                return;
            }
        }
    }

    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
