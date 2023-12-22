import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    static int S, I, E;
    public static void main(String[] args) {
        
        int t = r.nextInt();
        for(int q = 1; q <= t; q++){
            S = r.nextInt();
            I = r.nextInt();
            E = r.nextInt();
            int bs = search();
            // System.out.println("BS " + bs);
            if(bs < 0){bs = 0;}
            if(bs > E || bs < 0){
                pw.println(0);
            } else{
                pw.println(E - bs + 1);
            }
        }

        pw.close();
    }

    static int search() {
        int left = (int)-2E8;
        int right = (int)2E8;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(mid) && !check(mid-1)) {
                return mid;
            } else if (check(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static boolean check(int Es){
        return S + Es > I + (E - Es) ? true : false;
    }
}

/**
*                _        _                 _                                                
*               | |      | |               | |                                               
*   ___ ___   __| | ___  | |__  _   _    __| | __ _ _ __ _ __ ___ _ __     _   _  __ _  ___  
*  / __/ _ \ / _` |/ _ \ | '_ \| | | |  / _` |/ _` | '__| '__/ _ \ '_ \   | | | |/ _` |/ _ \ 
* | (_| (_) | (_| |  __/ | |_) | |_| | | (_| | (_| | |  | | |  __/ | | |  | |_| | (_| | (_) |
*  \___\___/ \__,_|\___| |_.__/ \__, |  \__,_|\__,_|_|  |_|  \___|_| |_|   \__, |\__,_|\___/ 
*                                __/ |                               ______ __/ |            
*                               |___/                               |______|___/             
 */