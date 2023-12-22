import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = 0;
        long tmp = 1;
        while(h > 0) {
            h /= 2;
            ans += tmp;
            tmp *= 2;
        }
        System.out.println(ans);
    }
}