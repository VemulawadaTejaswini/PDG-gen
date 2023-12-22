import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String mymy = s.next();
        String first = mymy.substring(0, 2);
        String second = mymy.substring(2, 4);
        int fi = Integer.parseInt(first);
        int se = Integer.parseInt(second);
        String alg;
        if ((0 < fi && fi <= 12) && (0 < se && se <= 12)) {
            alg = "AMBIGUOUS";
        } else if (fi > 12 && se > 12) {
            alg = "NA";
        } else if (fi <= 0 || se <= 0) {
            alg = "NA";
        } else if (fi <= 12) {
            alg = "MMYY";
        } else {
            alg = "YYMM";
        }

        System.out.println(alg);
    }
}
