import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        int a = 1;

        while (true) {
            if (n <= a) {
                break;
            }
            a *= k;
            ans++;
        }

        System.out.println(ans);
    }
}
