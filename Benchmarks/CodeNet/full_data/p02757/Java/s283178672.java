import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int resolve(int n, int p, String s) {
        int counter = 0;
        Map<String, Boolean> map = new HashMap<>();
        BigInteger bp = new BigInteger(String.valueOf(p));
        BigInteger b0 = new BigInteger(String.valueOf(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String str = s.substring(i, j);
                if (map.containsKey(str)) {
                    if (map.get(str)) {
                        counter++;
                    }
                } else {
                    BigInteger bi = new BigInteger(str);
                    if (bi.mod(bp).equals(b0)) {
                        //System.out.println(bi);
                        map.put(str, true);
                        counter++;
                    } else {
                        map.put(str, false);
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        //System.out.println(resolve(1,3,"01230"));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String s = sc.next();
        System.out.println(resolve(n, p, s));
    }
}
