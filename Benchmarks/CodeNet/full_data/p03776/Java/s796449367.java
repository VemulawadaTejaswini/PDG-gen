import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        long[][] comb = new long[51][51];

        for(int i=0;i<=50;i++){
            comb[i][0]= 1;
            for(int j=1;j<=i;j++){
                comb[i][j] = comb[i-1][j-1]+comb[i-1][j];
            }
        }

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        List<Long> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(in.nextLong());
        }

        Collections.sort(list,Collections.reverseOrder());
        long sum = 0,last = -1;
        for(int i=0;i<a;i++){
            sum+=list.get(i);
            last = list.get(i);
        }

        out.printf("%.6f\n",sum/(double)a);

        int count = 0,other = 0;
        for(int i=0;i<n;i++){
            if(list.get(i) == last){
                count++;
            }
            if(list.get(i) > last){
                other++;
            }
        }
        long ret = 0;
        if(other == 0){
            for(int i=a;i<=b;i++){
                if(count >=i){
                   ret+=comb[count][i];
                }
            }
        }else{
            ret+= comb[count][a-other];
        }

        out.print(ret);
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
