import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int hundreds = x / 100;
        int tens = (x / 10) % 10;
        int ones = x % 10;
        
        int ans = hundreds + tens + ones;
        
        if(x % ans == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
        
    }
}
