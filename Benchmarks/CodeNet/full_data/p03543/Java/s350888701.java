import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] count = new int[10];
        boolean ans = false;
        for (int i = 0; i < s.length(); i++) {
            int index = Character.getNumericValue(s.charAt(i));
            count[index] += 1;
            if (count[index] >= 3) ans = true;
        }

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
