import java.util.Scanner;

public class Main {

    private static long a;
    private static long b;
    private static long c;
    private static boolean poison = false;
    private static long count;

    private static void eatA() {
        a--;
        poison = false;
    }

    private static void eatB() {
        b--;
        count++;
        poison = false;
    }

    private static void eatC() {
        c--;
        count++;
        poison = true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        while (true) {
            if (poison && a == 0 && b == 0) {
                break;
            }
            if (b == 0 && c == 0) {
                break;
            }
            if (!poison) {
                if (c > 0) {
                    eatC();
                } else {
                    if (b > 0) {
                        eatB();
                    } else if (a > 0) {
                        eatA();
                    }
                }
            } else {
                if (b > 0) {
                    eatB();
                } else if (a > 0) {
                    eatA();
                }
            }
        }
        System.out.println(count);
    }

}
