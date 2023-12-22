import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        if (a < b && b-a-w > 0) {
            ans = b-a-w;
        } else if (a > b && a-b-w > 0) {
            ans = a-b-w;
        }
        System.out.println(ans);
    }
}