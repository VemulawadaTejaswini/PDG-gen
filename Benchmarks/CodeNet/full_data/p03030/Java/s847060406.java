import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        SP[] sparr = new SP[n];
        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split(" ");
            sparr[i] = new SP(i + 1, arr[0], Integer.parseInt(arr[1]));
        }
        Arrays.sort(sparr);
        for (SP sp : sparr) {
            System.out.println(sp.id);
        }
    }
    private static class SP implements Comparable<SP> {
        int id;
        String s;
        int p;
        private SP(int id, String s, int p) {
            this.id = id;
            this.s = s;
            this.p = p;
        }
        public int compareTo(SP o) {
            int result = this.s.compareTo(o.s);
            return (result == 0) ? Integer.compare(o.p, this.p) : result;
        }
    }
}
