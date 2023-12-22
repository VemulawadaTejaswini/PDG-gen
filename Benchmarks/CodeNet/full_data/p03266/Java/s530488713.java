import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        int multipleOfK = N / K;
        int multipleOfHalfOfK = 0;

        if (K % 2 == 1) {
            out.println((int)Math.pow(multipleOfK, 3));
        } else {
            if (multipleOfK + K / 2 <= K) {
                multipleOfHalfOfK = multipleOfK + 1;
            } else {
                multipleOfHalfOfK = multipleOfK;
            }
            out.println((int)(Math.pow(multipleOfK, 3) + Math.pow(multipleOfHalfOfK, 3)));
        }
        out.close();
    }
}