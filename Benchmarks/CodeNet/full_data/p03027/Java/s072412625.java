import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < q; i++) {
            String[] nums = sc.nextLine().split(" ");
            int x = Integer.parseInt(nums[0]);
            int d = Integer.parseInt(nums[1]);
            int n = Integer.parseInt(nums[2]);
            long tmp;
            long total = 0;
            for (int k = 1; k <= n; k++) {
                tmp = x + (k - 1) * d;
                if (k == 1) {
                    total = tmp;
                } else {
                    total *= tmp;
                }
            }
            System.out.println(total % 1000003L);
        }
    }
}