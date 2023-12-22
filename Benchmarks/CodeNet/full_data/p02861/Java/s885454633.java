import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.OptionalDouble;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.Objects;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            List<C.Pair<Integer, Integer>> list = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                list.add(new C.Pair<>(in.Int(), in.Int()));
            }
            list.sort(Comparator.naturalOrder());

            List<Double> lens = new ArrayList<>();
            do {
                double sum = 0;
                for (int i = 0; i < N - 1; i++) {
                    C.Pair<Integer, Integer> a = list.get(i);
                    C.Pair<Integer, Integer> b = list.get(i + 1);
                    sum += Math.sqrt(Math.pow(a.k - b.k, 2) + Math.pow(a.v - b.v, 2));
                }
                lens.add(sum);
            } while (nextPermutation(list));
            out.printf("%.10f\n", lens.stream().mapToDouble(n -> n).average().getAsDouble());
        }

        <T extends Comparable<T>> boolean nextPermutation(List<T> array) {
            int size = array.size();
            boolean ok = false;

            //array[i]<array[i+1]を満たす最大のiを求める
            int i = size - 2;
            for (; 0 <= i; i--) {
                if (array.get(i).compareTo(array.get(i + 1)) < 0) {
                    ok = true;
                    break;
                }
            }

            //全ての要素が降順の場合、NextPermutationは存在しない
            if (!ok) return false;

            //array[i]<array[j]を満たす最大のjを求める
            int j = size - 1;
            for (; ; j--) {
                if (array.get(i).compareTo(array.get(j)) < 0) break;
            }

            //iとjの要素をswapする
            swap(array, i, j);

            //i以降の要素を反転させる
            int k = i + 1;
            int l = size - 1;
            while (k < l) {
                swap(array, k++, l--);
            }

            return true;
        }

        private <T extends Comparable<T>> void swap(List<T> array, int i, int j) {
            T tmp = array.get(i);
            array.set(i, array.get(j));
            array.set(j, tmp);
        }

        static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<C.Pair<K, V>> {
            K k;
            V v;

            Pair(K k, V v) {
                this.k = k;
                this.v = v;
            }

            public int compareTo(C.Pair<K, V> o) {
                int c = this.k.compareTo(o.k);
                if (c == 0) c = this.v.compareTo(o.v);
                return c;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                C.Pair<?, ?> pair = (C.Pair<?, ?>) o;
                return Objects.equals(k, pair.k) &&
                        Objects.equals(v, pair.v);
            }

            public int hashCode() {
                return Objects.hash(k, v);
            }

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

