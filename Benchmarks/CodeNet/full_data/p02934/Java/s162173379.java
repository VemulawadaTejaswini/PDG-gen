
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        double pSum = 0;
        
        for (int i = 0; i < n; i ++) {
            int in = s.nextInt();
            pSum += 1.0 / in;
        }
        
        System.out.println(1.0 / pSum);
    }
    
}
