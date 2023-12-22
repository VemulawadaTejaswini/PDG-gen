
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author baito
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    static int n,k;
    static int[] a  ;
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        ContestScanner sc = new ContestScanner();
        
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        
       boolean lim = false;
       boolean flag  = false ;
       boolean direct = false ;
       int min = sc.nextInt();
       a[0] = min ;
       if(min == k)direct  = true;
       if(a[0] > k)lim = true;
       //いったん要素取り込み最小値をさがす
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] > k)lim = true;
            if(a[i] < min) min = a[i];
            if(min == k)direct  = true;
            if(direct) {
                System.out.println("POSSIBLE");
                break;
            }
        }
        if(!direct && !lim)System.out.println("IMPOSSIBLE");
        else if(!direct){
            for (int i = 0; i < n; i++) {
                if(a[i] % min != 0)flag = true ;
            }
            if(flag)System.out.println("POSSIBLE");
            else if(k % min == 0) System.out.println("POSSIBLE");
            else System.out.println("IMPOSSIBLE");
        }
        
    }
  
}

//ここからてんぷれ
class ContestScanner {
    
    private final BufferedReader reader;
    private String[] line;
    private int idx;
    
    public ContestScanner() throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public ContestScanner(String filename) throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
    }
    //つけたし 

    public String readLine() throws Exception {
        return reader.readLine();
    }
    
    public String nextToken() throws IOException {
        if (line == null || line.length <= idx) {
            line = reader.readLine().trim().split(" ");
            idx = 0;
        }
        return line[idx++];
    }
    
    public long nextLong() throws IOException, NumberFormatException {
        return Long.parseLong(nextToken());
    }
    
    public int nextInt() throws NumberFormatException, IOException {
        return (int) nextLong();
    }
    
    public double nextDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(nextToken());
    }
}

