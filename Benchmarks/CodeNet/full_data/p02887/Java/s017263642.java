

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        Scanner s1 = new Scanner(System.in);
        String slimes = s1.nextLine();
        
        int output = 1;
        
        for (int i = 1; i < n; i ++) {
            if (slimes.charAt(i) != slimes.charAt(i - 1)) {
                output ++;
            }
        }
        
        System.out.println(output);
    }
    
}
