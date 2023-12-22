
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long L = scan.nextLong();
        long R = scan.nextLong();
        
        long result = 0;
        if (0 >= L || L >= 2000000000)
        {
        
        
            
        }
        else
        {
            for (long i = L; i <= R; i++){
                for (long j = i + 1; j <= R; j++){
                    long mod = (i * j) % 2019;
                    if(result > mod || result == 0) result = mod;
                }      
            }
        }

        System.out.println(result);
    }
 
}