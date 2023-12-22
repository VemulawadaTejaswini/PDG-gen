import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int paintedRows = sc.nextInt();
        int paintedCols = sc.nextInt();

        System.out.println((h-paintedRows) * (w-paintedCols));
    }
}