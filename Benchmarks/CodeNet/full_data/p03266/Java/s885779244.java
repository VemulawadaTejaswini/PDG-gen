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
        int multipleOfK = 0;
        for (int i = 1; i <= N; i++) {
            if (i % K == 0) {
                multipleOfK++;
            }
        }
        int multipleOfHalfOfK = 0;
        if (K % 2 == 0) {
            int halfOfK = K / 2;
            for (int i = 1; i <= N; i++) {
                if (i % K == halfOfK) {
                    multipleOfHalfOfK++;
                }
            }
        }
        out.println((int)(Math.pow(multipleOfK, 3) + Math.pow(multipleOfHalfOfK, 3)));
        out.close();
    }
}