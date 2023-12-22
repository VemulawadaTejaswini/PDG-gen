import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        int x = c - a, y = d - b;
        System.out.println((c - y) + " " + (d + x) + " " + (a - y) + " " + (b + x));
    }
}