import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        System.out.println(i / 100 * 111 >= i ? i / 100 * 111 : (i / 100 + 1) * 111);
    }
}