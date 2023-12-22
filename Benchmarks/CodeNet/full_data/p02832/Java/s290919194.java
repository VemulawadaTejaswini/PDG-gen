import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                PrintWriter pw = new PrintWriter(System.out);

                int n = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());
                int start = 1;
                for(int i=0 ; i<n ; i++) {
                        int x = Integer.parseInt(st.nextToken());
                        if(x == start) {
                                start++;
                        }
                }

                if(start == 1) {
                        pw.println(-1);
                }
                else {
                        start--;
                        pw.println(n-start);
                }


                pw.flush();
                pw.close();
        }
}
