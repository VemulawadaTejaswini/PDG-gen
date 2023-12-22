import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC159C - Maximum Volume

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        double d1 = l / 3.0;

        System.out.println(d1 * d1 * d1);
    }
}
