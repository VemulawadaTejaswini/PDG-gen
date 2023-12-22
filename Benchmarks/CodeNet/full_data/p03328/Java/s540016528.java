import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b - a;
        int d = (c * (c + 1)) / 2 - b;
        System.out.println(d);
    }
}