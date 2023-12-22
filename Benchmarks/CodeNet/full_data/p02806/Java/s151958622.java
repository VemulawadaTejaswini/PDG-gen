import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] titles = new String[n];
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            titles[i] = sc.next();
            times[i] = sc.nextInt();
        }
        String target = sc.next();
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flag) {
                sum += times[i];
            }
            if (target.equals(titles[i])) {
                flag = true;
            }
        }
        System.out.println(sum);
    }
}