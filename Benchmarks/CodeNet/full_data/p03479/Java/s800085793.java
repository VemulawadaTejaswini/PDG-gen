
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int num = x;
        int count = 1;
        while (num < y) {
            count++;
            num = num * 2;
//            System.out.println(num);
        }
        System.out.println(count);

    }
}
