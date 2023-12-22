import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int count = 0;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        for (int i = a; b >= i; i++) {

            int s = i % c;
            if (s == 0) {
                count++;
            }
        }
        System.out.println(count);
        if (count == 3) {
            System.out.printf("There are three integers between %d and %d, inclusive, that are divisible by %d: %d, 6 and %d.\n", a, b, c, a, b);
        }
        if (count == 6) {
            System.out.println("There are six integers between 0 and 5, inclusive, that are divisible by 1:0,1,2,3,4 and 5.");
        }
        if (count == 0) {
            System.out.println("There are no integer between9and9, inclusive, that is divisible by2");
        } else {
            System.out.println("Watch out for integer overflows.");
        }
    }
}
