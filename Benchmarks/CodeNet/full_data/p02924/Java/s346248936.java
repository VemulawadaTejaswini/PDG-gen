import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long sum = 0;
        for(int i = N - 1; i > 0; i--){
            sum += i;
        }
        
        System.out.println(sum);
    }
}
