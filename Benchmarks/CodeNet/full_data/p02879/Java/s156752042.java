import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        
        if (a > 9 || b > 9) {
            System.out.println(-1);
        } else {
            System.out.println(a * b);
        }
        scanner.close();
    }
}