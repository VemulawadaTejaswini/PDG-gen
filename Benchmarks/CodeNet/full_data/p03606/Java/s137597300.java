import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            ans += r - l + 1;
        }
        System.out.println(ans);
    }
}