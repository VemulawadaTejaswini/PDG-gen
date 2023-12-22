import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long count = 0;
        
        for(long i = a; i < b+1; i++){
            if(i%x == 0){
                count ++;
            }
        }
    }
}
