import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long sum = 0;
        for(long i = 1; i <= n; i++)
        {
            if(i % 5 != 0 && i % 3 != 0)
            {
                sum += i;
            }
        }
        
        System.out.println(sum);
        
        
    }
}
