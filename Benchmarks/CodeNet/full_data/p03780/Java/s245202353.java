import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        int n = in.nextInt();
        long k = in.nextLong();

        List<Long> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            long v = in.nextLong();
            if(v < k) list.add(v);
        }

        Collections.sort(list,Collections.reverseOrder());
        n = list.size();
        int start = 0,ans = n;
        long v = 0;
        while (true){
            v+= list.get(start);
            int x;
            for(x = start+1;x<n;x++){
                if(v+list.get(x) < k){
                    v+=list.get(x);
                }else {
                    break;
                }
            }
            start = x-1;
            if(start+1 == n){
                out.print(ans);
                return;
            }

            if(v + list.get(n-1) >= k){
                out.print(0);
                return;
            }
            int idx = -1;
            for(int i= n-1;i>start;i--){
                if(v+list.get(i) >= k){
                    idx = i;
                    break;
                }
            }

            if(idx == -1){
                out.print(ans);
                return;
            }
            //out.println(v + " " + start + " " + idx);
            ans-=(idx-start+1);
            start = idx+1;
        }
    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
