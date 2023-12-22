import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int ans = (b * (n-1) + a) - (a * (n-1) + b) + 1;
        System.out.println(ans <= 0 ? 0: ans);
    }
}