import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = br.readLine();
        int size = line.length();
        int N = 0;
        boolean changed = true;
        while (changed) {
            int count = size - line.replace("BW", "").length();
            if (count == 0) {
                changed = false;
            } else {
                N += count / 2;
                line = line.replace("BW", "WB");
            }
        }
        out.println(N);
        out.close();
    }
}
