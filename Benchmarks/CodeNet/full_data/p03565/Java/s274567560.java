import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        char[] pat = rd.readLine().toCharArray();
        int n = pat.length;
        char[] sub = rd.readLine().toCharArray();
        int m = sub.length;
        int s = n-m+1;
        for(int i=0;i<s;i++) {
            boolean ok = true;
            for(int j=0;j<m;j++) {
                if(pat[i+j] != '?' && pat[i+j] != sub[j]) {
                    ok = false;
                    break;
                }
            }
            if(ok) {
                arraycopy(sub,0,pat,i,m);
                for(int k=0;k<n;k++) {
                    if(pat[k] == '?') {
                        pat[k] = 'a';
                    }
                }
                out(new String(pat));
                return;
            }
        }
        out("UNRESTORABLE");
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
