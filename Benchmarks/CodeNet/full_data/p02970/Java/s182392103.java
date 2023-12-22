import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        ans = (n + (d * 2 + 1) -1) / (d * 2 + 1);
        System.out.println(ans);
    }
}