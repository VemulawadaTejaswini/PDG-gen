
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastIO fastIO = new FastIO();
        String a, b;
        int ans = 0;
        a = fastIO.read();
        b = fastIO.read();

        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == b.charAt(i))
                ++ans;
        }
        System.out.println(ans);
    }

    private static class FastIO {
        private StringTokenizer stringTokenizer;
        private BufferedReader bufferedReader;

        public FastIO() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            stringTokenizer = null;
        }

        public String read() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreTokens()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return stringTokenizer.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(read());
        }

        public long readLong() {
            return Long.parseLong(read());
        }
    }
}