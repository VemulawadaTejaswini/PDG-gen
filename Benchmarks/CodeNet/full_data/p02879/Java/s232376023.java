import java.util.Scanner;

public class a99 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a < 9 && b < 9 ? a*b : -1);
    }
}