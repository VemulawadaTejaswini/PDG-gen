import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.next());

        n /= 1.08;
        int nInt = (int) n;
        double ans = Math.ceil(n);

        if ((n - nInt) + (1/1.08) <= 1 && (n - nInt) > 0 ) {
            System.out.println(":(");
        } else {
            System.out.print((int)ans);
        }
    }
}