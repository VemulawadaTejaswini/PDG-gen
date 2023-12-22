import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int oddd = (a + 1) / 2;
        double ans = oddd * 1.0 / a;
        System.out.println(ans);

    }
}
