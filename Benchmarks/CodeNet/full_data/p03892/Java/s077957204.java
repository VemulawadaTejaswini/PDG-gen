import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int high = Math.abs(A - C);
        int width = Math.abs(B - D);
        if ((high % 2 == 0) && (width % 2 == 0)) {
            System.out.println(Math.max(high, width));
        } else if (high == width) {
            System.out.println(Math.max(high, width));
        } else if ((Math.max(high, width)) % (Math.min(high, width)) == 0) {
            System.out.println(Math.max(high, width));
        } else {
            System.out.println(high + width - 1);
        }
    }
}