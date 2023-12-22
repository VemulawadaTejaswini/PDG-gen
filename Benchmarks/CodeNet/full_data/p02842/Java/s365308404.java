import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        boolean exist = false;
        int price = 0;
        for (int i=1; i<=N; i++) {
            if ((int) (i*1.08) == N) {
                price = i;
                exist = true;
                break;
            }
        }
        out.println(exist ? price : ":(");
        
        out.flush();
    }
}