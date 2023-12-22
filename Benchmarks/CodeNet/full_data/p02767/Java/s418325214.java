import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int a[] = new int[n];

        for(int i=0 ; i<n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int min = a[0];
        int max = a[n-1];

        int minAns = Integer.MAX_VALUE;
        for(int i=min ; i<=max ; i++) {
            int total = 0;
            for(int j=0 ; j<n ; j++) {
                total += (a[j]-i)*(a[j]-i);
            }
            minAns = Math.min(minAns, total);
        }

        pw.println(minAns);
        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
