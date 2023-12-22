import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        int total = 0;
        int[] votes = new int[n];
        for (int i = 0; i < n; i++) {
            votes[i] = in.nextInt();
            total += votes[i];
        }

        double criteria = Math.ceil((double)total / (4 * m));
        int count = 0;
        for (int vote: votes) {
            if (vote >= criteria)count++;
        }
        
        out.println(count >= m ? "Yes": "No");
        out.close();

    }
}
