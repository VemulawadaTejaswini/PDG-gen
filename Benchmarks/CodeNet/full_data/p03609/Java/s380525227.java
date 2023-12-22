import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int t = scan.nextInt();

        System.out.println(Math.max(x - t, 0));

    }
}
