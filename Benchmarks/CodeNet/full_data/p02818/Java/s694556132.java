import java.util.Scanner;

public class Main {

    public static void num(int a, int b, int k) {
        int count = 0;
        while (true) {
            if (a >= 1) {
                if (count != k) {
                    a--;
                    count++;
                } else {
                    break;
                }
            } else if (b >= 1) {
                if (count != k) {
                    b--;
                    count++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        System.out.println("a =" + a + "b =" + b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int k = s.nextInt();
        num(a, b, k);
    }
}
