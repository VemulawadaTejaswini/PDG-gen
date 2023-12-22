import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
public class Main {
    public static void main(String args[]) {
        Sc sc = new Sc(System.in);
        int N = sc.nI();
        long T = sc.nI();
        long A = sc.nI();
        for(int i = 1; i<N; i++) {
            long Ti = sc.nI();
            long Ai = sc.nI();
            double diff = T;
            diff = diff*Ai - (Ti+0.0)*A;
            if(diff+0.01<0) {
                if(A%Ai != 0) {
                    A = ((A + Ai - 1)/Ai)*Ai;
                }
                T = A/Ai*Ti;
            } else if(diff - 0.01>0) {
                if(T%Ti != 0) {
                    T = ((T + Ti - 1)/Ti)*Ti;
                }
                A = T/Ti*Ai;
            }
        }
        System.out.println(A + T);
    }
}
class Sc {
    public Sc(InputStream i) {
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasM() {
        return peekToken() != null;
    }

    public int nI() {
        return Integer.parseInt(nextToken());
    }

    public double nD() { 
        return Double.parseDouble(nextToken());
    }

    public long nL() {
        return Long.parseLong(nextToken());
    }

    public String n() {
        return nextToken();
    }

    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null) 
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}