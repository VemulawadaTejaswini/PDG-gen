import java.util.HashMap;
import java.util.Scanner;

/**
 * ABC043D
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String ans = "";

        Boolean unbalance = false;
        for (int i = 2; i < str.length(); i++) {
            for (int j = 0; j < str.length() - i + 1; j++) {
                HashMap<Character, Integer> map = new HashMap<>();
                String sub = str.substring(j, i + j);

                for (int k = 0; k < sub.length(); k++) {
                    char c = sub.charAt(k);

                    if (!map.containsKey(c)) {
                        map.put(c, 1);
                    } else {
                        map.put(c, map.get(c) + 1);
                    }
                }

                int sumVal = 0;
                int max = 0;
                for (int now : map.values()) {
                    if (now > max) {
                        max = now;
                    }
                    sumVal += now;
                }

                if (0.5 < (double) max / (double) sumVal) {
                    unbalance = true;
                    ans = Integer.toString(j + 1) + " " + Integer.toString(i + j);
                }

                if (unbalance)
                    break;
            }

            if (unbalance)
                break;
        }

        if (!unbalance) {
            System.out.println("-1 -1");
        } else {
            System.out.println(ans);
        }
    }
}