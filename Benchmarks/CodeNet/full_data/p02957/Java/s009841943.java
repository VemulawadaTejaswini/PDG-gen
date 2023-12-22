
import java.util.*;






// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Main{
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner scanner = new Scanner(System.in);
        long a=0,b=0;
        a = scanner.nextLong();
        b = scanner.nextLong();
        long sum = a+b;
        if(sum%2==0) {
            System.out.println(sum/2);
        }
        else {
            System.out.println("IMPOSSIBLE");
        }
        
    }
    
    
    
}
