import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a = x1 - x2;
        int b = y1 - y2;
        int x3 = x2 + b;
        int y3 = y2 - a;
        int x4 = x3 + a;
        int y4 = y3 + b;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}