import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int even = num1 * (num1 - 1) / 2;
        int odd = num2 * (num2 -1) / 2;
      
        // System.out.println(even);
        // System.out.println(odd);
        
        System.out.println(even + odd);
    }
}