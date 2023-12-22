import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = {64, 32, 16, 8, 4, 2, 1};
        
        for (int n : nums) {
            if (N >= n) {
                System.out.println(n);
                return;
            }
        }
    }
}

