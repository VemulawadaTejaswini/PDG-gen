import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int total = 0, min = 100;
        for (int i = 0; i < n; i++) {
            int a = l + i;
            total += a;
            if (Math.abs(a) < Math.abs(min)) min = a;
        }
        System.out.println(total-min);
    }
}