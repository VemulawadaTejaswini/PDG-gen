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
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(Math.sqrt((double)a*b) < (c-a-b)/2.0) {
            os.println("Yes");
        } else {
            os.println("No");
        }
    }
}