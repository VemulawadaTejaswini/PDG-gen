import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * @author
 */

public class Main {

    public static char find(String a, String b, String c) {
        List<Character> aData = getList(a.toCharArray());
        List<Character> bData = getList(b.toCharArray());
        List<Character> cData = getList(c.toCharArray());

        // Alice starts
        char turn = aData.remove(0);
        char winner = 'A';
        boolean goOn = true;

        while (goOn) {
            switch (turn) {
                case 'a':
                    if (aData.isEmpty()) {
                        winner = 'A';
                        goOn = false;
                        break;
                    }
                    turn = aData.remove(0);
                    break;
                case 'b':
                    if (bData.isEmpty()) {
                        winner = 'B';
                        goOn = false;
                        break;
                    }
                    turn = bData.remove(0);
                    break;
                case 'c':
                    if (cData.isEmpty()) {
                        winner = 'C';
                        goOn = false;
                        break;
                    }
                    turn = cData.remove(0);
                    break;
            }

        }
        return winner;
    }

    private static List<Character> getList(char[] data) {
        List<Character> list = new LinkedList<Character>();

        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;


        String alice = scanner.next();
        String bob = scanner.next();
        String charlie = scanner.next();

        out.println(Main.find(alice, bob, charlie));

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
            String[] data = nextStringArray();
            int[] a = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data = nextStringArray();
            Integer[] a = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data = nextStringArray();
            long[] a = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }
    }
}

