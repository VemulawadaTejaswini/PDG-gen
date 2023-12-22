import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next()), h = Integer.parseInt(sc.next()), x = Integer.parseInt(sc.next()), y = Integer.parseInt(sc.next());

        int a1 = Math.min(x * h, h * w - x * h);
        int a2 = Math.min(y * w, h * w - y * w);

        int result = Math.max(a1, a2);
        boolean multi = a1 == a2;

        System.out.println(result + " " + (multi ? "1" : "0"));
    }
}
