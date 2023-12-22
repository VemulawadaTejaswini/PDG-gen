import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

    static boolean lose(int pos, List<Integer> moves, int n) {
        int leftMost = pos;
        int rightMost = pos;
        for(int i = 0; i < moves.size(); i++) {
            int x = moves.get(i);
            if (x == -1) rightMost--;
            if (x == 1) leftMost++;
            if (x == -2) leftMost = Math.max(leftMost - 1, 1);
            if (x == 2) rightMost = Math.min(rightMost + 1, n);
            if (leftMost > n || rightMost <= 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        int n = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        int si = in.nextInt();
        int sj = in.nextInt();
        String s = in.next();
        String t = in.next();

        List<Integer> horMoves = new ArrayList<>();
        for(int i = 0; i < l; i++) {
            if (s.charAt(i) == 'L') horMoves.add(-1);
            if (s.charAt(i) == 'R') horMoves.add(1);
            if (t.charAt(i) == 'L') horMoves.add(-2);
            if (t.charAt(i) == 'R') horMoves.add(2);
        }

        List<Integer> verMoves = new ArrayList<>();
        for(int i = 0; i < l; i++) {
            if (s.charAt(i) == 'U') verMoves.add(-1);
            if (s.charAt(i) == 'D') verMoves.add(1);
            if (t.charAt(i) == 'U') verMoves.add(-2);
            if (t.charAt(i) == 'D') verMoves.add(2);
        }

        if (lose(sj, horMoves, m) || lose(si, verMoves, n))
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
