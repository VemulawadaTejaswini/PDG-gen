import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger('0'+in.readLine());
        int res = recurse(n, (int) 1e9);
        BigInteger power = BigInteger.valueOf(10).pow(n.toString().length()-1);
        power = power.multiply(BigInteger.TEN);
        res = Math.min(res, 1 + recurse(power.subtract(n), power.toString().length()));
        System.out.println(res);
    }

    static HashMap<BigInteger, HashMap<Integer, Integer>> dp = new HashMap<>();

    static int recurse(BigInteger x, int last) {
        if (dp.containsKey(x) && dp.get(x).containsKey(last)) return dp.get(x).get(last);
        int f = x.toString().charAt(0)-'0';
        if (x.toString().length() == 1) {
            return Math.min(f, 10-f+1);
        }
        BigInteger power = BigInteger.valueOf(10).pow(x.toString().length()-1);
        //System.out.println("F="+f);
        int res = recurse(x.subtract(power.multiply(BigInteger.valueOf(f))),last) + f;
        if (!x.subtract(power.multiply(BigInteger.valueOf(f))).equals(BigInteger.ZERO)) {
            res = Math.min(res, recurse(power.multiply(BigInteger.valueOf(f+1)).subtract(x),last) + f + 1);
        }
        if (power.multiply(BigInteger.TEN).toString().length() != last) res = Math.min(res, recurse(power.multiply(BigInteger.TEN).subtract(x), power.multiply(BigInteger.TEN).toString().length()) +1);
        if (!dp.containsKey(x)) dp.put(x, new HashMap<>());
        dp.get(x).put(last, res);
        return res;
    }
}
/*


 */