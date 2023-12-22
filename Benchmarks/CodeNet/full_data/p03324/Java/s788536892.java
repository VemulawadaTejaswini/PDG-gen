import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        
        int ans = 0;
        if( N ==  100 ) {
            ans = (int)Math.pow(100, D) * (N + 1);
        } else {
            ans = (int)Math.pow(100, D) * N;
        }
        System.out.println( ans );
    }
}
