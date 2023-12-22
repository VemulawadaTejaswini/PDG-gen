import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public void solve() throws IOException {
        long k = nextLong();
        if(k == 0){
            out.print("1\n0");
            return;
        }
        if(k % 2 == 1){
            out.println(2);
            out.print(k / 2);
            out.print(" ");
            out.print(k * 2 - k / 2);
        }else{
            out.println(2);
            out.print((k + 2) / 2);
            out.print(" ");
            out.print((k + 2) / 2);
        }

    }


    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("sum2.in"));
//            out = new PrintWriter(new File("sum2.out"));
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}