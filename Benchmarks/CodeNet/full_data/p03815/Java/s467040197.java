// ABC 53
import java.util.*;

public class Main {

    static int COUNT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long count = 0;
        if(x >= 11) {
            count += (x / 11) * 2;
            x %= 11;
        }
        if(x >= 7) count += 2;
        else count++;
        System.out.println(count);
    }
}
