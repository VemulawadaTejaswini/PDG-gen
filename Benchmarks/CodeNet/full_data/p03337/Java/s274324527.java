import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        int ans = Math.max(a+b,Math.max(a-b,a*b));
        System.out.println(ans);
    }
}
