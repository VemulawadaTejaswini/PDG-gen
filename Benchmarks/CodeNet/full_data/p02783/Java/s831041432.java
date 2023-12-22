import java.util.Scanner;

public class Main {
    public void main() {
        Scanner scan = new Scanner(System.in);
        String H = scan.next();
        String A = scan.next();

        int h = Integer.parseInt(H);
        int a = Integer.parseInt(A);

        int num = h / a;

        System.out.println(num);
    }
}