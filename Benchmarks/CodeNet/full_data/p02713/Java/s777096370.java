import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        int tmpGcd;
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Map<String, Integer> tmpMap = new HashMap<>();
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                for (int c = 1; c <= N; c++) {
                    tmpGcd = mygcd(a, b, tmpMap);
                    sum = sum.add(BigInteger.valueOf(mygcd(tmpGcd, c, tmpMap)));
                }
            }
        }
        System.out.println(sum);
    }

    public static int mygcd(int a, int b, Map<String, Integer> tmpMap) {
        if (a == b) {
            return a;
        }
        int tmpGcd;
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(a);
        tmp.add(b);
        Collections.sort(tmp);
        String tmpStr = "" + tmp.get(0) + tmp.get(1);
        if (false && tmpMap.containsKey(tmpStr)) {
            tmpGcd = tmpMap.get(tmpStr);
        } else {
            tmpGcd = gcd(a, b);
            tmpMap.put(tmpStr, tmpGcd);
        }
        return tmpGcd;
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;
        else
            return gcd(num2, num1 % num2);
    }

    public static int gcda(int a, int b) {
        int tmp, r;
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

}