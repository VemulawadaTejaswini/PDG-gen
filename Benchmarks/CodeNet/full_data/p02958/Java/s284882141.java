import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strP = br.readLine().split(" ");
        int[] P = Stream.of(strP).mapToInt(Integer::parseInt).toArray();
        
        int count = 0;
        for(int i = 0; i < N; i++){
            
            if ( i+1 != P[i] ) count++;
            if ( count > 2 ) break;
        }
        
        System.out.println( (count <= 2) ? "YES" : "NO" );
    }
}
