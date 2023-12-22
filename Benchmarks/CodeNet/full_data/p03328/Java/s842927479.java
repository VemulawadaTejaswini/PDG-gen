import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int west = (b - a) * (b - a + 1) / 2;
        System.out.println(west - b);
        sc.close();
    }
}