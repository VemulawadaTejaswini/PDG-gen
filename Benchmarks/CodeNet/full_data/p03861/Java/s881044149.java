import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = b - a;
		long x = sc.nextInt();
		long count = 0;
        if (a == b) {
            count= a / x;
        } else if (a == 0) {
            count = c / x;
            count++;
        } else {
            count = c / x;
            if (a % x == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
