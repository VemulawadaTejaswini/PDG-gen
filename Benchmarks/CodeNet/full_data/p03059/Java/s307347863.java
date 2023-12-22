import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        
        int total = 0;
        int second = 1;
        while ( A * second <= T ){
            total += B;            
            second++;
        }
        
        System.out.println(total);
    }
}
