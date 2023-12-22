import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        List<Integer> values = IO.readLineAsIntList();
        int n = values.get(0);
        int m = values.get(1);

        int x = calc(n, m);

        IO.writeLine("" + x);
    }

    private static int calc(int n, int m) {
        int r = n - m;
        int p = bai(2, m);
        return p * (m * 1900 + r * 100);
    }

    private static int bai(int n, int p) {
        if( p == 0 ) return 0;
        if( p == 1 ) return n;

        int time = p - 1;
        for (int i = 0; i < time; i++) {
            n = n * 2;
        }
        return n;
    }

    public static class IO {

        private static BufferedReader br;

        private static BufferedReader br() {
            if( br == null ) {
                br = new BufferedReader( new InputStreamReader(new BufferedInputStream(System.in), StandardCharsets.UTF_8) );
            }
            return br;
        }

        public static String readLine() {
            try {
                return br().readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static int readLineAsInt() {
            return Integer.parseInt(readLine());
        }

        public static List<String> readLineAsList() {
            return Arrays.asList( readLine().split(" "));
        }

        public static List<Integer> readLineAsIntList() {
            return readLineAsList().stream()
                    .map( Integer::parseInt )
                    .collect(Collectors.toList());
        }

        public static void writeLine(String line) {
            System.out.println( line );
        }

        public static void writeLine(List<Integer> values) {
            StringJoiner j = new StringJoiner(" ");
            values.forEach(i -> j.add(String.valueOf(i)) );
            writeLine(j.toString());
        }

        public static void writeLines(List<String> lines) {
            lines.forEach(System.out::println);
        }
    }
}
