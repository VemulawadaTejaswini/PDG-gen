import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        char[] c = br.readLine().toCharArray();
        int n = c.length;

        boolean ans = true;

        ans &= isPal(c);

        char[] temp = new char[n/2];
        for(int i=0 ; i<n/2 ; i++) {
            temp[i] = c[i];
        }

        ans &= isPal(temp);

        for(int i=n/2+1 ; i<n ; i++) {
            temp[i-(n/2+1)] = c[i];
        }

        ans &= isPal(temp);

        if(ans) {
            pw.println("Yes");
        }
        else {
            pw.println("No");
        }

        
        
        
        
        
        pw.flush();
        pw.close();
    }

    static boolean isPal(char[] c) {
        int n = c.length;
        for(int i=0 ; i<n/2 ; i++) {
            if(c[i] != c[n-1-i]) {
                return false;
            }
        }
        return true;
    }
}
