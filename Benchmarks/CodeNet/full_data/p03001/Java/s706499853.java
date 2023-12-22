import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double result = (double)w * h / 2;
        if ((double)w / 2 == x && (double)h / 2 == y) {
            System.out.println(result + " " + 1);
        } else {
            System.out.println(result + " " + 0);
        }
        sc.close();
    }
}