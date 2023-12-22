import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }
    
    static final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        String S = scan.next();

        char[] charS = S.toCharArray();
        for (int i = 0; i < charS.length; i++) {
            int pos = Arrays.binarySearch(alphabet, 0, 26, charS[i]);
            pos = (pos + N) % 26;
            os.print(alphabet[pos]);
        }
        os.println();
    }
}