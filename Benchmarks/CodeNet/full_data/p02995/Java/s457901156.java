import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = sc.nextLong();
        
        long count = 0L;
        
        for( long i = a ; i <= b ; i++){
            
            if(i % c == 0){
                continue;
            }
            if(i % d == 0){
                continue;
            }
            count++;
        }
      
      System.out.println(count);
      
    }
}
