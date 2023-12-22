import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long w = Long.parseLong(sc.next());
        long h = Long.parseLong(sc.next());
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());

        long splitVertical = Math.min(x * h, (w - x) * h);
        long splitHorizontal = Math.min(w * y, w * (h - y));

        if (splitVertical == splitHorizontal) {
            System.out.println(splitVertical + " 1");
        } else {
            System.out.println(Math.max(splitVertical, splitHorizontal) + " 0");
        }
    }
}
