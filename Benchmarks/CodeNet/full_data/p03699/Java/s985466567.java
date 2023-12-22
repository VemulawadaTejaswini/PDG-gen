import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        if (sum % 10 != 0) {
            System.out.println(sum);
            return;
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                min = Math.min(min, array[i]);
            }
            if ((sum - min) % 10 == 0) {
                System.out.println(0);
            } else {
                System.out.println(sum - min);
            }
        }
    }
}
