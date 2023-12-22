import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        boolean yymm = is_yymm(s);
        boolean mmyy = is_mmyy(s);
        String answer = "NA";
        if (yymm && mmyy) {
            answer = "AMBIGUOUS";
        } else if (yymm) {
            answer = "YYMM";
        } else if (mmyy) {
            answer = "MMYY";
        }
        System.out.println(answer);
    }
    public static boolean is_yymm(String s) throws Exception {
        return is_year(s.substring(0,2)) && is_month(s.substring(2,4));
    }
    public static boolean is_mmyy(String s) throws Exception {
        return is_month(s.substring(0,2)) && is_year(s.substring(2,4));
    }
    private static boolean is_month(String month) throws Exception {
        int x = Integer.parseInt(month, 10);
        if (x < 1) {
            return false;
        }
        if (12 < x) {
            return false;
        }
        return true;
    }
    private static boolean is_year(String month) throws Exception {
        int x = Integer.parseInt(month, 10);
        if (x < 0) {
            return false;
        }
        if (99 < x) {
            return false;
        }
        return true;
    }
}
