

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        int count = 1;
        
        while (a <= b) {
            a += a - 1;
            count++;
        }
        
        System.out.println(count);
    }
    
}
