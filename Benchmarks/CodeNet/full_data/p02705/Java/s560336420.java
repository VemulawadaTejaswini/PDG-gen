import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        DecimalFormat df = new DecimalFormat("0.000000000");
        double pi = 3.14159;
        int r = in.nextInt();
        out.println(df.format(pi*2*r));
        in.close();out.flush();out.close();
    }
}