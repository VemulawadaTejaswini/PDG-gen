import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String s = std.next();
        long k = std.nextLong();
        //  10^15
        String rest = s;
        long restLength = k;
        boolean countOne = false;
        while (rest.charAt(0) == '1') {
            rest = rest.replaceFirst("1", "");
            restLength--;
            if (restLength == 0) {
                countOne = true;
                break;
            }
        }

        if (countOne) {
            System.out.println(1);
        } else {
            System.out.println(rest.substring(0, 1));
        }
    }
}