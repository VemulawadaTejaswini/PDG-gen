import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        a--;
        
        long tmp = a / x;
        long tmp2 = b / x;
        
        System.out.println(tmp2 - tmp);
    }
}