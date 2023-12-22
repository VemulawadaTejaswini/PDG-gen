import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static final String UNRESTORABLE = "UNRESTORABLE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String part = scanner.next();
        String T = scanner.next();
        int start = 0;
        int end = 0;
        int indexInT = 0;
        ArrayList<Pair> pairs = new ArrayList<>();

        System.err.println(String.format("part: %s, T: %s", part, T));

        for (int i = 0; i < part.length(); i++) {
            char charInT = T.charAt(indexInT);
            char c = part.charAt(i);

            //System.out.println(String.format("charInT: %s, c: %s", charInT, c));

            if (part.length() - i < T.length() - indexInT) {
                System.out.println(UNRESTORABLE);
                return;
            }

            if (c == charInT || c == '?') { // match or wildcard
                if (indexInT == 0 ) start = i;
                indexInT++;
                if (indexInT == T.length()) {
                    end = i;
                    pairs.add(new Pair(start, end));
                    start = 0; end = 0; indexInT = 0;
                }
            } else { // not match
                indexInT = 0;
            }
        }

        //System.out.println(String.format("start: %d, end: %d", start, end));
        //`System.out.println(String.format("wildcards: %s", wildcards));

        Collections.sort(pairs);
        Collections.reverse(pairs);

        start = pairs.get(0).start;
        end = pairs.get(0).end;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < start; i++) {
            char c = part.charAt(i);
            if (part.charAt(i) == '?') {
                sb.append('a');
            } else {
                sb.append(c);
            }
        }

        sb.append(T);

        for (int i = end; i < part.length() - 1; i++) {
            sb.append('a');
        }

        //System.out.println(String.format("result : %s", sb.toString()));
        System.out.println(sb.toString());
    }

    static class Pair implements Comparable<Pair> {
        int start, end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Pair) {
                Pair p = (Pair) o;
                return p.start == this.start && p.end == this.end;
            }
            return super.equals(o);
        }

        @Override
        public int hashCode() {
            return start ^ end;
        }

        @Override
        public int compareTo(Pair o) {
            if (start != o.start){
                return Integer.compare(start, o.start);
            }

            return Integer.compare(end, o.end);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}