import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long count = 0;
        for (long i = a; i <= b; i++) {
            count++;
            if (count <= k || b - count - 1 <= k) {
                System.out.println(i);
            }
        }
    }
}
