import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long w = in.nextLong();
        long h = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        double s = w /2.0 * h;
        int hasMany = (x*2==w && y*2==h) ? 1 : 0;
        System.out.print(s);
        System.out.print(" ");
        System.out.print(hasMany);
    }
}
