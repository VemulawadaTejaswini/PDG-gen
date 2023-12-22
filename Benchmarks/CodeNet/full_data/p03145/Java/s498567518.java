import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int height = scanner.nextInt();
        int bottom = scanner.nextInt();
        int hypotenuse = scanner.nextInt();
        System.out.println((height * bottom) / 2);
    }
}