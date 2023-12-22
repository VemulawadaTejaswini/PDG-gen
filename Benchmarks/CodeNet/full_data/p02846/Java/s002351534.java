
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
        long T1 = scan.nextLong();
        long T2 = scan.nextLong();
        long A1 = scan.nextLong();
        long A2 = scan.nextLong();
        long B1 = scan.nextLong();
        long B2 = scan.nextLong();
        if((A1 < B1 && A2 < B2) || (A1 > B1 && A2 >B2)) {
            os.println(0);
            return;
        }

        long ans = 0;
        double time = T1;
        HashSet<Double> set1 = new HashSet<>();
        HashSet<Double> set2 = new HashSet<>();
        while(true) {
            //first
            double t = Math.abs(A1-B1)*time/(double)Math.abs(A2-B2);
            if(t > T2) {
                os.println(ans);
                return;
            }
            ans++;
            if(t == T2 || set1.contains(t)) {
                os.println("infinity");
                return;
            }
            set1.add(t);
            //second
            double t1 = Math.abs(A2-B2)*(T2-t)/(double)Math.abs(A1-B1);
            if(t1 > T1) {
                os.println(ans);
                return;
            }
            ans++;
            if(set2.contains(t1)) {
                os.println("infinity");
                return;
            }
            set2.add(t1);
            time = T1-t1;
        }
    }
}