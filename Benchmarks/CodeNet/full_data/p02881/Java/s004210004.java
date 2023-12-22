import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> nums = new ArrayList<Long>();
        for (long i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                nums.add(i);
            }
        }
        long num1 = nums.get(nums.size() / 2);
        long result = num1 - 1 + (n / num1 - 1);
        System.out.println(result);
    }
}