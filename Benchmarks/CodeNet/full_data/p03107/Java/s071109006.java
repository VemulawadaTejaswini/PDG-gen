import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int baseLength = S.length();
        int tempLength = baseLength;
        String tempString = S;

        for (; true; ) {
            tempString = tempString.replaceAll("01", "");
            tempString = tempString.replaceAll("10", "");

            if (tempString.length() == tempLength) {
                    System.out.println(baseLength - tempLength);
                    return;
            }
            tempLength = tempString.length();
        }
    }
}