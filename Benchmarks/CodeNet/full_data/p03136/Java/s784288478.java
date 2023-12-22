import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int[] l = new int[n-1];

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            if (num > max) {
                max = num;
            } else {
                l[i] = num;
            }
        }
        int sum = 0;
        for (int length : l) {
            sum += length;
        }
        if (max < sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
