import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<String, Integer> s = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arrS = sc.next().split("");
            Arrays.sort(arrS);
            StringBuilder sb = new StringBuilder();
            for (String c : arrS) {
                sb.append(c);
            }
            if (s.containsKey(sb.toString())) {
                s.replace(sb.toString(), s.get(sb.toString()) + 1);
            } else {
                s.put(sb.toString(), 0);
            }
        }

        int result = 0;
        for (int count : s.values()) {
            for (int i = count; i >= 0; i --) {
                result += i;
            }
        }

        System.out.println(result);
    }
}