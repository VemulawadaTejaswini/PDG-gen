import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 11;
        long b = n % 11;
        long c = (b <= 5) ? 1 : 2;
        
        long answer = a * 2 + c;
        
        System.out.println(answer);
    }
}