import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.util.NoSuchElementException;
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
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            HashMap<Integer, TaskC.Prefecture> prefectures = new HashMap<>();
            TaskC.City[] cities = new TaskC.City[m];

            HashMap<Integer, Integer> count = new HashMap<>();

            for (int i = 0; i < m; i++) {
                int p = in.nextInt();
                int y = in.nextInt();
                cities[i] = new TaskC.City(p, y);
                count.put(p, count.getOrDefault(p, 0) + 1);
            }

            for (int i = 0; i < m; i++) {
                int p = cities[i].getPrefecture();
                if (!prefectures.containsKey(p)) prefectures.put(p, new TaskC.Prefecture(count.get(p)));
                prefectures.get(p).addCity(cities[i]);
            }

            for (int k : prefectures.keySet()) {
                prefectures.get(k).sort();
            }

            for (TaskC.City cc : cities) {
                String cp = Integer.toString(cc.getPrefecture());
                String cn = Integer.toString(1 + prefectures.get(cc.getPrefecture()).getCityIndex(cc));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 6 - cp.length(); i++) sb.append(0);
                sb.append(cp);
                for (int i = 0; i < 6 - cn.length(); i++) sb.append(0);
                sb.append(cn);
                out.println(sb);
            }
        }

        static class Prefecture {
            TaskC.City[] cities;
            int n;
            static Comparator<TaskC.City> cityComparator = Comparator.comparing(TaskC.City::getYear);

            Prefecture(int m) {
                cities = new TaskC.City[m];
                n = 0;
            }

            int getCityIndex(TaskC.City c) {
                return Arrays.binarySearch(cities, c, cityComparator);
            }

            void addCity(TaskC.City c) {
                cities[n++] = c;
            }

            void sort() {
                cities = Arrays.copyOf(cities, n);
                Arrays.sort(cities, cityComparator);
            }

        }

        static class City {
            private int year;
            private int prefecture;

            City(int p, int y) {
                prefecture = p;
                year = y;
            }

            public int getYear() {
                return year;
            }

            public int getPrefecture() {
                return prefecture;
            }

        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
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
            if (b < '0' || b > '9') throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
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

    }
}

