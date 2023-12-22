import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int a = s.nextInt();
        int r = (int)Math.ceil(1.0 * h / a);
        System.out.println(r);
    }
}

