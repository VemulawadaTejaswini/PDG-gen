import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 13) {
            System.out.println(b);
            return;
        }
        if (a <= 5) {
            System.out.println(0);
            return;
        }
        System.out.println(b / 2);
    }

}
