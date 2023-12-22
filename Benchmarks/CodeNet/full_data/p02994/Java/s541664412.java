import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        List<Integer> t = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            t.add(l + i - 1);
        }
        int absMinimum = Integer.MAX_VALUE;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : t) {
            sum += num;
            if (Math.abs(num) < absMinimum) {
                absMinimum = Math.abs(num);
                minimum = num;
            }
        }
        System.out.println(sum - minimum);
    }
}
