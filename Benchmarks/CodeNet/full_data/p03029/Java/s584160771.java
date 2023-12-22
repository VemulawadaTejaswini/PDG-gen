import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int p = sc.nextInt();

        p += 3 * a;

        System.out.println(p / 2);

        sc.close();
        ;
    }
}