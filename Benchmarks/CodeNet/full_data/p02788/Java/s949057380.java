import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        HashMap<Integer, Long> points = new HashMap<>();
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            long h = Long.parseLong(st.nextToken());
            points.put(x, h);
            X[i] = x;
        }

        Arrays.sort(X);

        long ans = 0;
        int ptr = 0;
        for (;ptr < N; ptr++) {
            if (points.get(X[ptr]) <= 0) continue;
            int left = X[ptr];
            int right = left + 2*D;
            long h = points.get(X[ptr]);
            long bombs = h/A;
            if (h % A > 0) ++bombs;
            ans += bombs;
            int k = ptr;
            while (left <= X[k] && X[k] <= right) {
                long ch = points.get(X[k]);
                points.put(X[k], ch-bombs*A);
                ++k;
                if (k >= N) break;
            }
        }

        System.out.println(ans);
    }

}