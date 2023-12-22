import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int minLocation = -1;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) {
                minLocation = i;
            }
        }
        int ans = 0;

        int leftNum = minLocation;
        int rightNum = n - minLocation - 1;
        if (leftNum < k - 1) {
            // left side of minLocation
            ans += 1;
            // right side of minLocation
            ans += cal(rightNum - (k - (leftNum + 1)), k);
        } else if (rightNum < k - 1) {
            // right side of minLocation
            ans += 1;
            // left side of minLocation
            ans += cal(leftNum - (k - (rightNum + 1)), k);
        } else {
            // left side of minLocation
            ans += cal(leftNum, k);
            // right side of minLocation
            ans += cal(rightNum, k);
        }

        System.out.println(ans);

        sc.close();
    }

    static int cal(int num, int k) {
        int ret = 0;
        ret += num / (k - 1);
        if (num % (k - 1) != 0) {
            ret++;
        }
        return ret;
    }

}
