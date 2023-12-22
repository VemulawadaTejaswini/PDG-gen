import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }

    private static class Node {
        char ch;
        Node[] children = new Node[27];
        List<Integer> strings = new ArrayList<>();
        int size = 0;

        public Node(char ch) {
            this.ch = ch;
        }

        @Override
        public String toString() {
            return String.valueOf(ch);
        }
    }


    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int[][][] lessThan = new int[27][27][];
        String[] allStrings = new String[n];

        Node root = new Node((char) 0);

        for (int i = 0; i < n; i++) {
            String s = in.nextString() + (char) ('a' - 1);
            allStrings[i] = s;
            Node node = root;
            for (int j = 0; j < s.length(); j++) {
                int c = getCharIndex(s.charAt(j));
                if (node.children[c] == null) {
                    node.children[c] = new Node(s.charAt(j));
                }
                node = node.children[c];
                node.size++;
            }
            node.strings.add(i);
        }

        fill(lessThan, root, allStrings, new ArrayList<>(), 0);

        int q = in.nextInt();
        for (int ii = 0; ii < q; ii++) {
            int k = in.nextInt();
            String order = (char) ('a' - 1) + in.nextWord();

            int less = 0;
            for (int i = 0; i < order.length(); i++) {
                for (int j = i + 1; j < order.length(); j++) {
                    int c1 = getCharIndex(order.charAt(i));
                    int c2 = getCharIndex(order.charAt(j));
                    if (lessThan[c1][c2] != null) {
                        less += lessThan[c1][c2][k - 1];
                    }
                }
            }
            out.println(less + 1);
        }

        out.close();
    }

    private static void fill(int[][][] lessThan, Node node, String[] allStrings, List<int[]> letterSize, int i) {
        for (Integer sNum : node.strings) {
            for (int j = 0; j < letterSize.size(); j++) {
                int[] sizeToAdd = letterSize.get(j);
                for (int k = 0; k < sizeToAdd.length; k++) {
                    if (sizeToAdd[k] != 0) {
                        int ch2 = getCharIndex(allStrings[sNum].charAt(j));
                        if (lessThan[k][ch2] == null) {
                            lessThan[k][ch2] = new int[allStrings.length];
                        }
                        lessThan[k][ch2][sNum] += sizeToAdd[k];
                    }
                }
            }
        }

        for (int ch1 = 0; ch1 < node.children.length; ch1++) {
            if (node.children[ch1] == null) {
                continue;
            }
            letterSize.add(new int[27]);
            for (int ch2 = 0; ch2 < node.children.length; ch2 ++) {
                if (node.children[ch2] == null || ch1 == ch2) {
                    continue;
                }
                letterSize.get(letterSize.size() - 1)[ch2] += node.children[ch2].size;
            }
            fill(lessThan, node.children[ch1], allStrings, letterSize, i + 1);
            letterSize.remove(letterSize.size() - 1);
        }
    }

    private static int getCharIndex(Character ch1) {
        return (ch1 - 'a' + 1);
    }


    private static void outputArray(int[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < ans.length; i++) {
            int an = ans[i];
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}
