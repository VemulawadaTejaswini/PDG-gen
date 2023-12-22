import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double a = (num);
        double b = a/2;
        double x = Math.ceil(b);
        double y = Math.floor(b);
        double z = x * y;
        String s = "" + z;
        System.out.print(s);
        scan.close();
    }
}