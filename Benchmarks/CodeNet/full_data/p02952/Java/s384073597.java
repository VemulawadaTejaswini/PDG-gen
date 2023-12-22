import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n < 100) {
            System.out.println(9 - (9 - Math.min(n, 9)));
        } else if (n < 10000) {
            System.out.println(909 - (999 - Math.min(n, 999)));
        } else {
            System.out.println(90909 - (99999 - Math.min(n, 99999)));
        }
    }
}
