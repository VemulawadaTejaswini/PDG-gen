import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(n * Math.min(a,b));
    }
}