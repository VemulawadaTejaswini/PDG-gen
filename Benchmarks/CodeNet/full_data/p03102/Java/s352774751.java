import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
//import org.apache.commons.lang3.StringUtils;
 
 
/**
 *
 * @author aj
 */
public class Main {
    
    public static void main(String[] args){
        try {
            //Scanner sc = new Scanner(System.in);
            BufferedInputStream bf = new BufferedInputStream(System.in);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(bf, StandardCharsets.UTF_8));
            OutputStream out = new BufferedOutputStream ( System.out );
            String[] nmc = in.readLine().split(" ");
            int n = Integer.parseInt(nmc[0]);
            int m = Integer.parseInt(nmc[1]);
            int c = Integer.parseInt(nmc[2]);
            
            String[] sb = in.readLine().split(" ");
            int r = 0;
            for(int i=0;i<n;i++){
                int s = c;
                String[] sa = in.readLine().split(" ");
                for(int j=0;j<m;j++){
                    s += Integer.parseInt(sa[j]) * Integer.parseInt(sb[j]);
                }
                if (s>0) r++;
            }
            out.write((r+"\n").getBytes());
            out.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    
    
}