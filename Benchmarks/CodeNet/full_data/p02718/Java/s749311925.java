import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int total = 0;
        int[] votes = new int[n];
        for (int i = 0; i < n; i++) {
            votes[i] = Integer.parseInt(st.nextToken());
            total += votes[i];
        }

        int necessaryVotes = (int)Math.ceil(1.0 * total / (4 * m));
        int canPrint = 0;
        for (int i = 0; i < n; i++) {
            if (votes[i] >= necessaryVotes) canPrint++;
        }

        System.out.println(canPrint >= m ? "Yes" : "No");
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write("\n");
//        bw.close();
    }

}