import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long w = std.nextLong();
        long h = std.nextLong();
        long x = std.nextLong();
        long y = std.nextLong();
        
        int same = (w / 2.0 == x && h / 2.0 == y) ? 1 : 0;
        double square = w * h / 2.0;
        System.out.println(String.format("%s %d", square, same));
    }
}