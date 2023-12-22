import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        long num;
        if (end - start == 1) {
            num = start ^ end;
        } else if (end - start == 0) {
            num = start;
        } else {
            num = start ^ (start + 1);
            for (long i = start + 2; i <= end; i++) {
                num = num ^ i;
            }
        }
        
        System.out.println(num);
    }
}