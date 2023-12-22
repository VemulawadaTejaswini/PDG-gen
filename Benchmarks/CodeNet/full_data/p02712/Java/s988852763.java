import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long value = 0;
        
        for (long i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) value += i;
        }
        
        System.out.println(value);
    }
}
