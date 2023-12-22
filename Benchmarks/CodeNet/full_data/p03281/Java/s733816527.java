import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int ans = 0;
        
        for(int i = 3; i <= N; i += 2) {

            int divisor = 0;
            for(int j = 1; j * j < i; j += 2) {
                if(i % j == 0) {
                    divisor += 2;
                }
            }

            if(divisor == 8) {
                ans += 1;
                // pw.println(i);
            }
            
        }

        pw.print(ans);
        br.close();
        pw.close();
    }
}