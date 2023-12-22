import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            }
            else {
                oneCount++;
            }
        }

        System.out.println(Math.min(zeroCount, oneCount) * 2);

    }
}
