import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tmp = N;
        int sum = 0;
        int[] nums = {100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};

        for (int num : nums) {
            sum = tmp / num;
            tmp = tmp % num;
        }

        System.out.println(N % sum == 0 ? "Yes" : "No");
    }
}

