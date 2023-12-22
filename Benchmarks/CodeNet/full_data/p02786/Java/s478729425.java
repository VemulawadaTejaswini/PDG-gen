import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static boolean visited[][];
    static int[][] s;
    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        long H = scan.nextLong();
        long ans = 1;
        long numOfMon = 1;
        while(H != 1){
            H = H/2;
            numOfMon *= 2;
            ans += numOfMon;
        }

        os.println(ans);
    }

}