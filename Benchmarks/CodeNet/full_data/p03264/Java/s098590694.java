import java.util.Scanner;
 
public class InputSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double a = (num);
        double sum = a/2;
        double x = Math.ceil(sum);
        double y = Math.floor(sum);
        double z = x * y;
        System.out.print(z);
        scan.close();
    }
}