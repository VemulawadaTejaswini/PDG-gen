import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        if (a+b <= a*2-1 && b*2-1 <= a*2-1) {
            System.out.println(a*2-1);
        } else if (a*2-1 <= a+b && b*2-1 <= a+b) {
            System.out.println(a+b);
        } else {
            System.out.println(b*2-1);
        }
    }
}
