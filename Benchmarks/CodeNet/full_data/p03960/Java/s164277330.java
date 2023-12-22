import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
public class Main {
    static int M[][];
    static int V[][];
    static int H;
    static String a;
    static String b;
    public static void main(String args[]) {
        Sc sc = new Sc(System.in);
        H = sc.nI();
        int W = sc.nI();

        String[] B = new String[H];
        for(int i = 0; i<H; i++) {
            B[i] = sc.n();
        }
        M = new int[H+1][H+1];
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb[] = new StringBuilder[W];
        for(int i = 0; i<W; i++) {
            sb[i] = new StringBuilder();
        }
        for(int i = 0; i<H; i++) {
            for(int j = 0; j<W; j++) {
                sb[j].append(B[i].charAt(j));
            }
        }
        
        int sum = 0;
        for(int x = 0; x<W-1; x++) {
            for(int i = 0; i<=H; i++) {
                for(int j = 0; j<=H; j++) {
                    M[i][j] = -1;
                }
            }
            a = sb[x].toString();
            b = sb[x+1].toString();
            //System.out.println(a);
            V = new int[H+1][H+1];
            for(int i = 1; i<=H; i++) {
                for(int j = 1; j<=H; j++) {
                    V[i][j] = V[i-1][j-1];
                    if(a.charAt(i-1) == b.charAt(j-1)) V[i][j]++;
                }
            }
            sum += opt(H,H);
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
    public static int opt(int l, int r) {
        if(l== 0 || r == 0) return 0;
        if(M[l][r] != -1) return M[l][r];
        M[l][r] = V[l][r] + Math.min(opt(l-1,r), opt(l, r-1));
        return M[l][r];
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