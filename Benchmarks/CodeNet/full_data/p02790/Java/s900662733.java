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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n==m) for(int i=0 ; i<n ; i++)pw.print(n);
        else if(n < m) for(int i=0 ; i<m ; i++) pw.print(n);
        else for(int i=0 ; i<n ; i++) pw.print(m);


        pw.flush();
        pw.close();
    }
}
