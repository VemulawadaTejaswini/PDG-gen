import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i= 0;i<=n;i++) {
            if (String.valueOf(n).length() % 2 == 1 ) ans++;
        }
        System.out.println(ans);

    }
}