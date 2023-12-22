import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


/**
 *
 * @author
 *
 *
 *
 */

public class Main {
    public static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void find(String string) {
        boolean isMain = false;
        String sub;

        for (int i = 1; i < string.length(); i++) {
            sub = string.substring(i);
            if ( isMain(sub) ) {
                System.out.format("%d %d", i+1, string.length() -1 );
                return;
            }
        }

        System.out.format("%d %d",-1, -1);
	}

    private static boolean isMain(String string) {

        int[] histogram = new int[LETTERS.length()];
        char[] chars = string.toUpperCase().toCharArray();

        for (char c : chars) {
            histogram[c - 'A']++;
        }

        boolean  isMain = false;

        for (int c : histogram) {
            if ( c > string.length()/2 && string.length() > 1  ) {
                isMain = true;
                break;
            }
        }

        return isMain;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Main main = new Main();

        String string = scanner.next();

        find(string);

        scanner.reader.close();
        out.close();
    }

    // -----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader reader;

        public MyScanner() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
        }

        public void close() throws IOException {
            this.reader.close();
        }

        int nextInt() {
            return Integer.parseInt(this.next());
        }

        long nextLong() {
            return Long.parseLong(this.next());
        }

        double nextDouble() {
            return Double.parseDouble(this.next());
        }

        String next() {
            String str = "";
            try {
                str = this.reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        String[] nextStringArray() {
            String[] str = null;
            try {
                str = this.reader.readLine().trim().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextIntArray() {
            String[] data  = nextStringArray();
            int[] a  = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data  = nextStringArray();
            Integer[] a  = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data  = nextStringArray();
            long[] a  = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }
    }
}

