

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
//import org.apache.commons.lang3.StringUtils;
 
 
/**
 *
 * @author aj
 */
class CandyDistribution {
    
    public static void main(String[] args){
        try {
            //Scanner sc = new Scanner(System.in);
            BufferedInputStream bf = new BufferedInputStream(System.in);
            BufferedReader r = new BufferedReader(
                    new InputStreamReader(bf, StandardCharsets.UTF_8));
            OutputStream out = new BufferedOutputStream ( System.out );
            String[] nx = r.readLine().split(" ");
            int n = Integer.parseInt(nx[0]);
            long x = Integer.parseInt(nx[1]);
            String[] sa = r.readLine().split(" ");
            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = Long.parseLong(sa[i]);
            int cnt = 0;
            Arrays.sort(a);
            long sum = 0;
            for(int i=0;i<n;i++){
                sum += a[i];
                if (sum<x && i<n-1) cnt++;
                if (i==n-1 && sum==x) cnt++;
            }
            out.write((cnt+"\n").getBytes());
            out.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}