import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.println(resolve(a, b));

        // System.out.println(System.currentTimeMillis() - startTime);
    }

    private static int resolve(int a, int b) {

        int aPlusb = a + b;
        int aMinusb = a - b;
        int ab = a * b;

        int max = aPlusb;
        if (max < aMinusb) {
            max = aMinusb;
        }
        if (max < ab) {
            max = ab;
        }

        return max;
    }

}