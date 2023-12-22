
import java.util.Scanner;

public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = a + b;
        if (sum <= a - b) {
            sum = a - b;
        } else if (sum <= a * b) {
            sum = a * b;
        }
        System.out.println(sum);
    }
}
