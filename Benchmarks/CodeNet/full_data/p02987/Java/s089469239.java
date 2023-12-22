import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        Map<String, Integer> sMap = new HashMap<String, Integer>();
        for (int i = 0; i < S.length(); i++) {
            String s = S.substring(i, i + 1);
            Integer sCount = 1;
            if (sMap.containsKey(s)) {
                sCount = sMap.get(s) + 1;
            }
            sMap.put(s, sCount);
        }

        if (sMap.size() != 2) {
            System.out.println("No");
            return;
        }

        for (String s : sMap.keySet()) {
            if (sMap.get(s) == 2) {
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        }

    }
}