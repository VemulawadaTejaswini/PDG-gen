import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        double frac = h/ (double) a;
        System.out.println((int) Math.ceil(frac));
    }
}
