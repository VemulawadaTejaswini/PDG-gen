import java.util.*;
import java.io.*;
public class Main{
    static class Event implements Comparable<Event>{
        long x;
        int i;
        public Event(long _x, int _i){
            x = _x;
            i = _i;
        }
        public int compareTo(Event other){
            return x-other.x>0?1:x-other.x<0?-1:0;
        }
        
    }

    public static void main(String[] args) {
        FastReader in = new FastReader(System.in);
        int a = in.nextInt(), b = in.nextInt(), q = in.nextInt();
        long[] s = new long[100005], t = new long[100005];
        Event[] x = new Event[100005];
        s[0] = -(long)(1e11);
        s[a+1] = (long)(1e11);
        for (int l = 1; l <= a; ++l){
            s[l] = in.nextLong();
        }
        t[0] = -(long)(1e11);
        t[b+1] = (long)(1e11);
        for (int l = 1; l <= b; ++l){
            t[l] = in.nextLong();
        }
        for (int l = 0; l < q; ++l){
            x[l] = new Event(in.nextLong(), l);
        }
        Arrays.sort(x, 0, q);


        int posS = 1, posT = 1;
        long[] answer = new long[100005];
        for (int l = 0; l < q; ++l){
            while(s[posS] < x[l].x) posS++;
            while(t[posT] < x[l].x) posT++;
            answer[x[l].i] = Math.min(
               Math.min(
                   Math.max(s[posS], t[posT]) - x[l].x,
                   x[l].x - Math.min(s[posS-1], t[posT-1])
               ),
               Math.min(
                   Math.min(
                       s[posS] - x[l].x + s[posS] - t[posT-1],
                       t[posT] - x[l].x + t[posT] - s[posS-1]
                   ),
                   Math.min(
                       x[l].x - s[posS-1] + t[posT] - s[posS-1],
                       x[l].x - t[posT-1] + s[posS] - t[posT-1]
                   )
               )
            );
        }
        for (int l = 0; l < q; ++l){
            System.out.println(answer[l]);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream I) {
            br = new BufferedReader(new InputStreamReader(I));
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}