import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Parser parser = new Parser();

    public static void main(String[] args) {
        int A = parser.parseInt();
        int B = parser.parseInt();
        int Q = parser.parseInt();

        long[] s = new long[A];
        for(int i = 0; i < A; i++){
            long v = parser.parseLong();
            s[i] = v;
        }

        long[] t = new long[B];
        for (int i = 0; i < B; i++) {
            long v = parser.parseLong();
            t[i] = v;
        }

        Arrays.sort(s);
        Arrays.sort(t);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            long v = parser.parseLong();
            long ans = Long.MAX_VALUE;

            int srIdx = -Arrays.binarySearch(s, v) - 1;
            int slIdx = srIdx - 1;

            int trIdx = -Arrays.binarySearch(t, v) - 1;
            int tlIdx = trIdx - 1;

            if(srIdx < A && trIdx < B){
                ans = Math.min(ans, Math.max(s[srIdx] - v, t[trIdx] - v));
            }

            if(slIdx >= 0 && tlIdx >= 0){
                ans = Math.min(ans, Math.max(v - s[slIdx], v - t[tlIdx]));
            }

            if(slIdx >= 0 && trIdx < B){
                ans = Math.min(ans, Math.min(v - s[slIdx], t[trIdx] - v) + t[trIdx] - s[slIdx]);
            }

            if(tlIdx >= 0 && srIdx < A){
                ans = Math.min(ans, Math.min(v - t[tlIdx], s[srIdx] - v) + s[srIdx] - t[tlIdx]);
            }
            stringBuilder.append(ans);
            stringBuilder.append('\n');
        }

        System.out.print(stringBuilder.toString());
    }
}


class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new NoSuchElementException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    Long parseLong() {
        fill();
        if(!inputs.isEmpty()) {
            return Long.parseLong(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    Double parseDouble() {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    String parseString() {
        fill();
        return inputs.removeFirst();
    }

}