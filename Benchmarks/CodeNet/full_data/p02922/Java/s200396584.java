import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tap = 1;
        int num;
        while (true) {
            num = tap * a - (tap - 1);
            if (num >= b) {
                System.out.println(tap);
                break;
            }
            tap++;
        }
    }

}
