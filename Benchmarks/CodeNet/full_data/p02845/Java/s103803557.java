import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) a[i] = nextInt();

        long possibilities = 1;
        int[] colors = new int[3];

        for (int i = 0; i < a.length; i++) {
            int finalI = i;
            int numColors = (int) Arrays.stream(colors).filter(num -> num == a[finalI]).count();
            possibilities = (possibilities * numColors) % 1000000007;
            for (int j = 0; j < colors.length; j++) {
                if (colors[j] == a[i]) {
                    colors[j]++;
                    break;
                }
            }
        }

        System.out.println(possibilities);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
