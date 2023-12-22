import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            sum += s;
            if (s % 10 != 0 && s < min) {
                min = s;
            }
        }

        if (sum % 10 != 0) {
            System.out.println(sum);
        } else {
            sum -= min;
            if (sum < 0) {
                System.out.println(0);
            } else {
                System.out.println(sum);
            }
        }
    }
}
