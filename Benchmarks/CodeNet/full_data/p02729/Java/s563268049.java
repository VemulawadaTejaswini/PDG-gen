import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        System.out.println(n * (n - 1) / 2 + m * (m - 1) / 2);
    }
}
