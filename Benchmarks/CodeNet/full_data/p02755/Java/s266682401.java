
import java.util.*;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        double minA = A * 12.5;
        double maxA = (A + 1) * 12.5;
        double minB = B * 10;
        double maxB = (B + 1) * 10;

        if(minA <= maxB && minA >= minB) {
            System.out.println((int)minA);
        } else if (minB <= maxA && minB >= minA) {
            System.out.println((int)minB);
        } else{
            System.out.println(-1);
        }

    }
}
