import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        int x = Integer.parseInt(N.charAt(0) + "");
        int y = Integer.parseInt(N.charAt(1) + "");
        int z = Integer.parseInt(N.charAt(2) + "");

        if (x > y) {
            System.out.println(x + "" + x + "" + x);
        } else {
            x = x + 1;
            System.out.println(x + "" + x + "" + x);
        }
    }
}