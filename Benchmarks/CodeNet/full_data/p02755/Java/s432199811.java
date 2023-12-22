import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int oriA = (int)Math.ceil(A/0.08);
        int oriB = (int)Math.ceil(B/0.1);
        int min = Math.min(oriA, oriB);
        int max = Math.max(oriA, oriB);
        for(int i = min ; i <= max; i++){
            if((int)Math.floor(i*0.08) == A && (int)Math.floor(i*0.1) == B) {
                os.println(i);
                return;
            }
        }
        os.println(-1);
    }
}