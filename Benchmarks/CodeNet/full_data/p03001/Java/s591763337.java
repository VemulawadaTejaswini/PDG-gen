import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        double s = w * h / 2.0;
        int hasMany = (x*2==w && y*2==h) ? 1 : 0;
        System.out.print(s);
        System.out.print(" ");
        System.out.print(hasMany);
    }
}
