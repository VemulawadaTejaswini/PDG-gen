import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
            if (tmp >= max) {
                max = tmp;
            }
        }
        if (max < (sum - max)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}