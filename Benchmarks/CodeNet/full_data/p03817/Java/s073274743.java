import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        sc.close();
        
        long count = 0;
        
        if(N % 11 == 0)
            count = N/11 * 2;
        else if(N % 11 <= 6)
            count = N/11 *2 +1;
        else
            count = N/11 *2 + 2;
        
        System.out.println(count);
    }
}