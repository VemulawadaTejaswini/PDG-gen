import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        scanner.next
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
//        double a = Math.pow(10, 9);
//        double b = Math.pow(10, 9);
//        double c = Math.pow(10, 9);


        double left = Math.sqrt(a) + Math.sqrt(b);
//        System.out.println(left);
        double right = Math.sqrt(c);
//        System.out.println(right);

        if (left < right){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
