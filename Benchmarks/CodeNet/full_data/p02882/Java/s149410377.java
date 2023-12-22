import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        double a = (double)scan.nextInt();
        double b = (double)scan.nextInt();
        double x = (double)scan.nextInt();

        double answer = 0;
        if(x >= a*a*b/2) {
            double tana = 2*(a*a*b-x)/(a*a*a);
            double radian = Math.atan(tana);
            answer = Math.toDegrees(radian);
        } else {
            double tana = a * b * b / (2 * x);
            double radian = Math.atan(tana);
            answer = Math.toDegrees(radian);
        }

        os.println(answer);

    }
}