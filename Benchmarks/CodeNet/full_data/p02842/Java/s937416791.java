import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.next());

        n /= 1.08;
        double ans = Math.round(n);


        if (ans * 1.08 < n * 1.08) {
            System.out.println(":(");
        } else {
            System.out.print((int)ans);
        }
    }
}