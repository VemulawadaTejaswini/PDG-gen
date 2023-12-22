
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(s, 1);
        for (int i = 2;; i++) {
            if (s % 2 == 0)
                s = s / 2;
            else
                s = 3 * s + 1;

            if (m.containsKey(s)) {
                System.out.println(i);
                break;
            } else {
                m.put(s, 1);
            }
        }
    }

}
