import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = (2 * x) / 11;
//        if((2 * x / 11) % 2 != 0) {
//            ans++;
//        }
        System.out.println(++ans);
    }
}