import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();

        sc.close();

        int ans = g - r + g;

        System.out.println(ans);
    }
}