import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kaisuu = sc.nextInt();
        int tasi = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < kaisuu; i++) {
            if (ans <= tasi) {
                ans *= 2;
            } else {
                ans += tasi;
            }
        }
        System.out.println(ans);
    }
}