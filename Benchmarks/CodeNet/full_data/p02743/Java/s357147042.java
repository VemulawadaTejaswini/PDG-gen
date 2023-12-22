import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double left = c - a - b;
        double right = Math.sqrt(a * b) * 2;
        if (left > right) System.out.println("Yes");
        else System.out.println("No");
    }
}