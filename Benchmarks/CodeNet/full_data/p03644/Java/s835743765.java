import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxNum = 0;
        int maxCount = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int tmpNum = i;

            while (true) {
                if (tmpNum % 2 != 0) break;

                count++;
                tmpNum /= 2;
            }

            if (maxCount < count) {
                maxNum = i;
                maxCount = count;
            }
        }

        System.out.println(maxNum);
    }
}
