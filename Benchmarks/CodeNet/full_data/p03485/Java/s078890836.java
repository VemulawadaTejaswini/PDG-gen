import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        int output = (int)Math.ceil((a+b)/2);
        System.out.println(output);
    }
}
