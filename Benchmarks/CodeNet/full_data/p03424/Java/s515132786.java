import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }
        long result = Stream.of(nums).distinct().count();
        if (result == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Four");
        }
    }
}
