import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Double x = (double)sc.nextInt();
        int ans = (int)Math.ceil(b/x)-(int)Math.ceil(a/x)+1;
        System.out.println(ans);
    }
}
