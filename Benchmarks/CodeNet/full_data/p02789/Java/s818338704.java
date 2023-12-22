import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n == m) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
