import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        sc.close();

        int ans = (a + b) * h / 2;

        System.out.println(ans);

    }
}