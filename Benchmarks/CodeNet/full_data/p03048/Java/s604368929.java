import java.util.*;

class Main {
    public static void main(String[] args) {
        int r, g, b;
        int R, G, B;
        int n;
        int ans = 0;

        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        g = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();

        for (R = 0; R <= 3000; R++) {
            for (G = 0; G <= 3000; G++) {
                int tmp = (n - R * r - G * g);

                if (tmp >= 0 && tmp % b == 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
