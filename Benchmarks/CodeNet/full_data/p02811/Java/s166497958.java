import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();

        if (k * 500 >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}