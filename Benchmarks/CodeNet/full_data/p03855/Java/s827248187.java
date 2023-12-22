import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    private static FastScanner scanner = new FastScanner();
    public static void main(String... args) {
        List<Set<Integer>> roads = new ArrayList<>(),
            rails = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = scanner.nextInt(), k = scanner.nextInt(), l = scanner.nextInt();
        makeSet(k, roads);
        makeSet(l, rails);
        roads.forEach
            (road -> rails.forEach
             (rail -> {
                 Set<Integer> s = new HashSet<>(road);
                 s.retainAll(rail);
                 if (s.size() > 1) {
                     s.forEach(key -> map.put(key, Optional.ofNullable
                                              (map.get(key))
                                              .orElse(0) + s.size()));
                 }
             }));
        System.out.println
            (IntStream.rangeClosed(1, n)
             .mapToObj(i -> String.valueOf(Optional.ofNullable(map.get(i))
                                           .orElse(1)))
             .collect(Collectors.joining(" ")));
    }
    private static boolean doesMatch(Set<Integer> s, int i, int j) {
        return s.contains(i) || s.contains(j);
    }
    private static void makeSet(int k, List<Set<Integer>> list) {
        IntStream.range(0, k)
            .forEach(n -> {
                    int p = scanner.nextInt(), q = scanner.nextInt();
                    if (!list.stream().anyMatch(s -> doesMatch(s, p, q))) {
                        Set<Integer> set = new HashSet<>();
                        set.add(p);
                        set.add(q);
                        list.add(set);
                    } else {
                        list.stream().filter(s -> doesMatch(s, p, q))
                            .forEach(s -> {
                                    s.add(p);
                                    s.add(q);
                                });
                    }
                });
    }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1; }
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126; }
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte(); }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next()); }
}