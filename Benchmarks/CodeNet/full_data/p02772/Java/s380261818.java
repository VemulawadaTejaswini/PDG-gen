import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n-- > 0) {
            int num = sc.nextInt();
            
            if (num % 2 == 0) {
                if (num % 5 == 0 || num % 3 == 0) {
                    
                } else {
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        
        System.out.println("APPROVED");
    }
}
