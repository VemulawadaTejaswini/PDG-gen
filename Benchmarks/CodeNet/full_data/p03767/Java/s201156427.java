import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        long count = 0;
        for (int i = 1; i <= n; i++) {
            count += list[3 * n - 2 * i];
        }
        System.out.println(count);
    }
}