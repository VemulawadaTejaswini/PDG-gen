import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        line = readLine();
        st = new StringTokenizer(line, " ");
        int costRight = 0;
        for (int i = 0; i < m; i++) {
            int p = Integer.parseInt(st.nextToken());
            if (x < p) {
                costRight++;
            }
        }
        System.out.println(Math.min(costRight, m - costRight));
    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
