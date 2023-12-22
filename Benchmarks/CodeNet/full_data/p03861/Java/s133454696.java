import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextInt();
        long count = (b / x) - (a / x);
        if (a == 0) {
            count++;
        }
        System.out.println(count);
    }
}
