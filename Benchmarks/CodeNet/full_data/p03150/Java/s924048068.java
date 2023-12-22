import java.util.Scanner;

public class Main {

    private static final String[] KEYENCE = "keyence".split("");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");

        int matchedLength = 0;
        Boolean removing = null;
        for (int i = 0; i < str.length; i++) {
            if (matchedLength == KEYENCE.length) {
                if (removing == null) {
                    break;
                }
                System.out.println("NO");
                return;
            }
            if (str[i].equals(KEYENCE[matchedLength])) {
                matchedLength++;
                if (removing == null) {
                    continue;
                }
                if (removing) {
                    removing = false;
                }
                continue;
            }
            if (removing == null || removing) {
                removing = true;
                continue;
            }
            break;
        }
        if (matchedLength == KEYENCE.length) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
