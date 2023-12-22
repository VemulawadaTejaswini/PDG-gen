import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");

        int N = Integer.parseInt(nums[0]);
        int Y = Integer.parseInt(nums[1]);
        int smallY = Y / 1000;
        int target = smallY - N;

        for (int i = 0; (i * 9) <= target; i++) {
            for (int j = 0; (i * 9 + j * 4) <= target; j++) {
                int z = isMeet(N, Y, i, j);
                if (z != -1) {
                    System.out.println(i + " " + j + " " + z);
                    System.exit(0);
                }
            }
        }
        System.out.println("-1 -1 -1");
    }

    public static int isMeet(int N, int Y, int x, int y) {
        int z = N - x - y;
        if (z >= 0 && Y == (10000 * x + 5000 * y + 1000 * z)) {
            return z;
        } else {
            return -1;
        }
    }
}