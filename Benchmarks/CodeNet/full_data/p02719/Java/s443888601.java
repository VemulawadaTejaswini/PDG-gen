import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        if (n > k) {
            n = n % k;
        }
        System.out.println(k - n > n ? n : k - n);
    }
}