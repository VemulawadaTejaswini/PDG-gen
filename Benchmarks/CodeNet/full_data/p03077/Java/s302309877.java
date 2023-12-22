import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long[] AE = new long[5];
        
        long min = (long)1e16; 
        for(int i = 0; i < 5; i++){
            AE[i] = sc.nextLong();
            min = Math.min(min, AE[i]);
        }

        System.out.println( 4L + (long)Math.ceil((double)N / min) );
    }
}
