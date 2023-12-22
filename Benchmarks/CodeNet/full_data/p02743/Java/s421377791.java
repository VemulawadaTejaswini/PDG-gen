import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double left = Math.sqrt(a * c) + Math.sqrt(b * c);
        double right = c;
        if (left > right) System.out.println("Yes");
        else System.out.println("No");
    }
}