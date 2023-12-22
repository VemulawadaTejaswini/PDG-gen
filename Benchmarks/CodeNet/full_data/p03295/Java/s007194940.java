import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        Pair[] pairs = new Pair[r];
        for( int i = 0; i < r; i++ ) {
            pairs[i] = new Pair(in.nextInt(), in.nextInt());
        }
        Arrays.sort(pairs);
        // for( Pair p : pairs ) System.out.printf("%d %d\n", p.a, p.b);
        int prev_end = -1;
        int ct = 0;
        for( int i = 0; i < r; i++ ) {
            Pair temp = pairs[i];
            // within bound
            if( prev_end <= temp.a ) ct++;
            prev_end = temp.b;
        }
        System.out.println(ct);
    }
    public static class Pair implements Comparable<Pair>{
        int a, b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo( Pair p ) {
            if( a == p.a ) return p.b - b;
            return a - p.a;
        }
    }
}