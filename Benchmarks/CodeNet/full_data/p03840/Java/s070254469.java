import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int i = sc.nextInt();
        int o = sc.nextInt();
        int t = sc.nextInt();
        int j = sc.nextInt();
        int l = sc.nextInt();
        int s = sc.nextInt();
        int z = sc.nextInt();

        long ans = o;
        ans += (i / 2) * 2;
        ans += (j / 2) * 2;
        ans += (l / 2) * 2;

        i %= 2;
        j %= 2;
        l %= 2;
        if (i * j * l == 1) {
            ans += 3;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
