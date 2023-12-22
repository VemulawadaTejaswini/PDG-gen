import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Map<String, Boolean> an = new HashMap<String, Boolean>();
        for (int i = 0; i < s.length(); i++) {
            String k = s.substring(i, i+1);
            if (an.containsKey(k)) {
                System.out.println("no");
                System.exit(0);
            } else {
                an.put(k, true);
            }
        }

        System.out.println("yes");
    }

}