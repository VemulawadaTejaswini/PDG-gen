import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Integer m = Integer.parseInt(scanner.next());

        if (m == 0) {
            System.out.println(0 + " " +0);
            System.exit(0);
        }

        String[] p = new String[m*2];
        for(int i = 0; i < m*2; i++) {
            p[i] = scanner.next();
        }

        Map<String, Integer> map = new HashMap<String, Integer>();

        boolean ac_check = false;
        int old_num = Integer.parseInt(p[0]);
        for(int i =0; i < p.length; i+=2) {
            Integer count = map.get(p[i+1]);
            if(ac_check && old_num == Integer.parseInt(p[i])) continue;
            map.put(p[i+1], (count == null) ? 1 : count + 1);

            if(p[i+1].equals("AC")) {
                ac_check = true;
                old_num = Integer.parseInt(p[i]);
            } else {
                ac_check = false;
            }
        }

        System.out.println(((map.get("AC") == null) ? 0 : map.get("AC")) + " " + ((map.get("WA") == null) ? 0 : map.get("WA")));
    }
}
