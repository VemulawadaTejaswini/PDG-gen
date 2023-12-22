import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        final int tag = 753;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.substring(i, i + 3).equals("0")) {
                continue;
            }
            int si = Integer.parseInt(s.substring(i, i + 3));
            if (Math.abs(si - tag) < min) {
                min = Math.abs(si - tag);
            }
        }

        System.out.println(min);
    }
}