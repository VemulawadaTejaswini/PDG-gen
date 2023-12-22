import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        if (n % 2 == 1) {
            System.out.println(0);
            return;
        }
        
        System.out.println(n / 10);
    }
}
