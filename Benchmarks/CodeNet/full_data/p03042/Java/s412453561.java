import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        Integer a = Integer.parseInt(N.substring(0, 2));
        Integer b = Integer.parseInt(N.substring(2, 4));

        System.out.println(result(a, b));
    }

    public static String exec(String N) {

        Integer a = Integer.parseInt(N.substring(0, 2));
        Integer b = Integer.parseInt(N.substring(2, 4));
        return result(a, b);
    }

    private static String result(int a, int b) {
        boolean isYYMM = isYY(a) && isMM(b);
        boolean isMMYY = isYY(b) && isMM(a);
        if (isYYMM && isMMYY) {
            return "AMBIGUOUS";
        } else if (isYYMM) {
            return "YYMM";
        } else if (isMMYY) {
            return "MMYY";
        } else {
            return "NA";
        }
    }

    private static boolean isYY(int yy) {
        return yy >= 0 && yy <= 99;
    }

    private static boolean isMM(int MM) {
        return MM > 0 && MM < 13;
    }
}
