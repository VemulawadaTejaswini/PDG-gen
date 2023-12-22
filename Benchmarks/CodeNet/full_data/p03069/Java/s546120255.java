import java.util.Scanner;

public class Main {
    private static final String PATTERN = "#.";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        System.out.println(replace(sc.next(), 0));
    }

    private static int replace(String str, int count) {
        int index = str.indexOf(PATTERN);
        if (index == -1) {
            return count;
        } else {
            count++;
            if (index == 0) {
                return replace(toWhite(str), count);
            } else if (index == str.length() - 2) {
                return replace(toBlack(str), count);
            } else {
                return Integer.min(replace(toBlack(str), count),replace(toWhite(str), count));
            }
        }
    }

    private static String toBlack(String str) {
        return str.substring(0, str.length() - 2) + "##";
    }

    private static String toWhite(String str) {
        return ".." + str.substring(2);
    }
}
