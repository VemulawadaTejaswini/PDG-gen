import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((b-2+a)%(a-1) == 0) {
            ans = (b - 2 + a) / (a - 1) - 1;
        } else {
            ans = (b - 2 + a) / (a - 1);
        }
        System.out.println(ans);

    }
}