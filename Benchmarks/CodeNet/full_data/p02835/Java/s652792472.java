import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();

        sc.close();

        System.out.println(A1 + A2 + A3 >= 22 ? "bust" : "win");

    }

}