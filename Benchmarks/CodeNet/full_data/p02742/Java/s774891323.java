import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long w = sc.nextInt();
        long ans = h * w / 2;
        if (h * w % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }
}