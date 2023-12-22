import javax.swing.text.MaskFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double roota = Math.sqrt(a);
        double b = scanner.nextDouble();
        double rootb = Math.sqrt(b);
        double c = scanner.nextDouble();
        double rootc = Math.sqrt(c);

        if (roota + rootb < rootc){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
