

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int sqt = (int) Math.sqrt(n);
        
        
        for (int i = sqt; i >= 1; i --) {
            if (n % i == 0) {
                System.out.println(i + n / i - 2);
                break;
            }
        }
        
    }
    
}
