import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = (A + B - 3) / (A - 1);

        System.out.println(ans);
    }
}
