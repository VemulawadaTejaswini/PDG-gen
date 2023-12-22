import java.util.Scanner;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int zen = Integer.valueOf(s.substring(0, 2));
        int kou = Integer.valueOf(s.substring(2, 4));
        String res = "AMBIGUOUS";
        if (12 < zen) {
            res = "YYMM";
        }
        if (12 < kou) {
            res = "MMYY";
        }
        System.out.println(res);
    }
}