import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public void solve() throws IOException {
        String s = br.readLine ();
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            out.print (s.charAt (i));
        }
        out.print (" ");
        for(int i = 6; i < 13; i++){
            out.print (s.charAt (i));
        }
        out.print (" ");
        for(int i = 14; i < 19; i++){
            out.print (s.charAt (i));
        }
    }


    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens ()) {
            try {
                sc = new StringTokenizer (br.readLine ());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken ();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt (nextToken ());
    }

    public boolean hasNext() {
        while (sc == null || !sc.hasMoreTokens ()) {
            try {
                String s = br.readLine ();
                if (s == null) {
                    return false;
                }
                sc = new StringTokenizer (s);
            } catch (IOException e) {
                throw new RuntimeException (e);
            }
        }
        return sc.hasMoreTokens ();
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble (nextToken ());
    }

    public long nextLong() throws IOException {
        return Long.parseLong (nextToken ());
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault (Locale.US);
        new Main ().run ();
    }

    public void run() {
        try {
            out = new PrintWriter (System.out);
            br = new BufferedReader (new InputStreamReader (System.in));
//            br = new BufferedReader (new FileReader ("triangle.in"));
//            out = new PrintWriter (new File ("triangle.out"));
            solve ();
            out.close ();
        } catch (IOException e) {
            e.printStackTrace ();
            System.exit (1);
        }
    }
}