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

    static class CharPair {
        char a;
        char b;

        public CharPair(char a, char b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CharPair charPair = (CharPair) o;
            return a == charPair.a &&
                    b == charPair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public String toString() {
            return a + "<" + b;
        }
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        Map<Character, List<Integer>> charToStr = new HashMap<>();
        Map<CharPair, Integer>[] lessThan = new HashMap[n];
        String[] allStrings = new String[n];

        for (int i = 0; i < n; i++) {
            String s = in.nextString() + '!';
            char firstChar = s.charAt(0);
            if (!charToStr.containsKey(firstChar)) {
                charToStr.put(firstChar, new ArrayList<>());
            }
            charToStr.get(firstChar).add(i);
            allStrings[i] = s;
            lessThan[i] = new HashMap<>();
        }

        fill(lessThan, charToStr, 0, allStrings);

        int q = in.nextInt();
        for (int ii = 0; ii < q; ii++) {
            int k = in.nextInt();
            String order = '!' + in.nextWord();

            int less = 0;
            for (int i = 0; i < order.length(); i++) {
                for (int j = i + 1; j < order.length(); j++) {
                    CharPair charPair = new CharPair(order.charAt(i), order.charAt(j));
                    if (lessThan[k-1].containsKey(charPair)) {
                        less += lessThan[k-1].get(charPair);
                    }
                }
            }
            out.println(less + 1);
        }

        out.close();
    }

    private static void fill(Map<CharPair, Integer>[] toAdd, Map<Character, List<Integer>> charToStr, int i, String[] allStrings) {
        for (Character ch1 : charToStr.keySet()) {
            for (Character ch2 : charToStr.keySet()) {
                if (ch1 == ch2) {
                    continue;
                }
                CharPair charPair = new CharPair(ch1, ch2);

                for (Integer s2 : charToStr.get(ch2)) {
                    int less = toAdd[s2].getOrDefault(charPair, 0);
                    less += charToStr.get(ch1).size();
                    toAdd[s2].put(charPair, less);
                }
            }
        }

        for (Character ch1 : charToStr.keySet()) {
            Map<Character, List<Integer>> newCharToStr = new HashMap<>();
            for (Integer s : charToStr.get(ch1)) {
                if (i + 1 >= allStrings[s].length()) {
                    continue;
                }
                char firstChar = allStrings[s].charAt(i + 1);
                if (!newCharToStr.containsKey(firstChar)) {
                    newCharToStr.put(firstChar, new ArrayList<>());
                }
                newCharToStr.get(firstChar).add(s);
            }
            fill(toAdd, newCharToStr, i + 1, allStrings);
        }
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