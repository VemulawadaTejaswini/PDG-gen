import java.util.*;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        DecimalFormat df = new DecimalFormat("0.0000000000");
        if (N % 2 == 0) {
            System.out.println("0.5000000000");
        } else {
            int a = (N - 1) / 2;
            double b = (a + 1.0) / N;
            System.out.println(df.format(b));
        }
    }
}