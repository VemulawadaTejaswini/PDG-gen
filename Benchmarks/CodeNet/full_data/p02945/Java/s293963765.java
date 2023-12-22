import java.util.*;

public class ABC137_A_Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int r1, r2, r3, out;

        r1 = a + b;
        r2 = a - b;
        r3 = a * b;

        out = r1;
        if (out < r2) out = r2;
        if (out < r3) out = r3;
        System.out.print(out);
    }

}
