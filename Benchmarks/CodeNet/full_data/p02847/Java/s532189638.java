import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            String[] week = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", };
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 0; i < week.length; i++) {
                map.put(week[i], 7 - i);
            }

            System.out.println(map.get(S));
        }
    }
}
