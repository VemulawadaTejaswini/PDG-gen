
import java.util.Scanner;

/**
 *
 * @author bhatti
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int fiveCount = 0, sevenCount = 0;
        if ( A == 5){
            fiveCount++;
        }
        if ( A == 7){
            sevenCount++;
        }
        if ( B == 5){
            fiveCount++;
        }
        if ( B == 7){
            sevenCount++;
        }
        if ( C == 5){
            fiveCount++;
        }
        if ( C == 7){
            sevenCount++;
        }
        
        System.out.println((fiveCount == 2 && sevenCount == 1)? "YES" : "NO");
        
    }
    
    
}
