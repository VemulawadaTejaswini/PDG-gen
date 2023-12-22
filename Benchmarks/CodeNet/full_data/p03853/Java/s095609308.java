import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] c = new String[h];
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.next();
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(c[i]);
            }
        }
    }
}