import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String ans = "Odd";
        if (a * b % 2 == 0) {
            ans = "Even";
        }
        
        System.out.println(ans);
    }
}
