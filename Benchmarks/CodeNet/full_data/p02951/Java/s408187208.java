import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int e = c - (a - b);

        if (e >= 0) System.out.println(e);
        else System.out.println("0");
    }
}