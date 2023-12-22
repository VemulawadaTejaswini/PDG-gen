import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long[] nums = new long[5];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            switch (name.charAt(0)) {
            case 'M':
                nums[0]++;
                break;
            case 'A':
                nums[1]++;
                break;
            case 'R':
                nums[2]++;
                break;
            case 'C':
                nums[3]++;
                break;
            case 'H':
                nums[4]++;
                break;
            }
        }

        long ans = 0l;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    ans += nums[i] * nums[j] * nums[k];
                }
            }
        }
        System.out.println(ans);
    }
}