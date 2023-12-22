import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n,sum = 0;

        n = sc.nextLong();
        
        for(long i = 1; i <= n; i++){
            if((i % 3 != 0) && (i % 5 != 0) && (i % 15 != 0)){
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
}
