import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                PrintWriter pw = new PrintWriter(System.out);

                st = new StringTokenizer(br.readLine());
                long n = Long.parseLong(st.nextToken());
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long diff = b-a;
                if(diff%2==0) {
                        pw.println(diff/2);
                }
                else {
                        pw.println(Math.max(a,b)-1);
                }



                pw.flush();
                pw.close();
        }
}
