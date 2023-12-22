
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
public class C121 {
    
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
            
            TreeMap<Long,List<Integer>> map = new TreeMap();
            long c = 0;
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i=0;i<n;i++){
                
                String[] ab = in.readLine().split(" ");
                a[i] = Integer.parseInt(ab[0]);
                b[i] = Integer.parseInt(ab[1]);
                if  (map.get(a[i])==null) map.put(a[i], new LinkedList());
                map.get(a[i]).add(i);
            }
            int nc = 0;
            
            for(long key:map.keySet()){
                for(int i:map.get(key)){
                    c += Math.min(m, b[i])*key;
                    m -= Math.min(m, b[i]);
                }
            }

            out.write((c+"\n").getBytes());
            out.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    
    
}