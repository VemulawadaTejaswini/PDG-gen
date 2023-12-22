
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
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        
        if(0 < (c-a-b)*(c-a-b)/4.0 - a*b) {
            os.println("Yes");
        } else {
            os.println("No");
        }
    }
}