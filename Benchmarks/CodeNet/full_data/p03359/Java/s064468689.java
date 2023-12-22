import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int total = a - 1;
        if (b >= a) {
            total += 1;
        }
        System.out.println(total);
    }

}