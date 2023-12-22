import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top = sc.nextInt();
        int bottom = sc.nextInt();
        int height = sc.nextInt();

        System.out.println(((top + bottom) * height) / 2);
    }
}