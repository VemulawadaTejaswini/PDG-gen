import java.io.*;
import java.util.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        long a[] = new long[n];
        HashMap<Long,Long> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            a[i] = sc.nextLong();
            map.put(a[i],0L);
        }

        for(int i=0;i<n;i++) {
            map.put(a[i],map.get(a[i])+1);
        }
        long ans = 0;
        for(long it:map.values()) {
            ans+= (it>1) ?it*(it-1)/2:0;
        }
        long dp[] = new long[n];
        for(int i=0;i<n;i++) {
            long v = map.get(a[i]);
            long val =map.get(a[i])-1;
            dp[i] = ans-v*(v-1)/2+val*(val-1)/2;
        }
        for(int i=0;i<n;i++)
            out.println(dp[i]);

        out.flush();
        out.close();
    }

    //solution functions here

    /*
     * ******************************************************************************************************************************
     * ******************************************************************************************************************************
     * ******************************************************************************************************************************
     * #########  #######  ######   ########  ##  ###   ##  ##    ##   #######  ##    ##   #######  ##   ##  #######   ########
     * ##    ###  ##       ##       ########  ##  ## #  ##   ##  ##    ##       ##    ##   ##       ##  ##   ##        ##    ##
     * ##    ###  #######  ######      ##     ##  ##  # ##     ##      #######  ##    ##   ##       ####     #######   ########
     * ##    ###  ##           ##      ##     ##  ##   ###     ##      ##       ##    ##   ##       ##  ##   ##        ##   ##
     * #########  #######  ######      ##     ##  ##    ##     ##      ##       ########   #######  ##   ##  #######   ##     ##
     *******************************************************************************************************************************
     *******************************************************************************************************************************
     *******************************************************************************************************************************
     */

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}

/* *****************************************************************************************************************************
 * I'M NOT IN DANGER, I'M THE DANGER!!!
 * *****************************************************************************************************************************
 */