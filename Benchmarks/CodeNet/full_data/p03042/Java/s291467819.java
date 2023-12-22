import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String s1 = str.substring(0, 2);
        String s2 = str.substring(2, 4);

        int s1i = Integer.valueOf(s1);
        int s2i = Integer.valueOf(s2);

        boolean s1IsM = 0 < s1i && s1i < 13;
        boolean s2IsM = 0 < s2i && s2i < 13;

        String result;

        if (s1IsM && s2IsM) {
            result = "AMBIGUOUS";
        } else if (!s1IsM && s2IsM) {
            result = "YYMM";
        } else if (s1IsM) {
            result = "MMYY";
        } else {
            result = "NA";
        }

        System.out.println(result);
    }

}