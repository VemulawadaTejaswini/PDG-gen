import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int selectSushis = sc.nextInt();

        Integer[] toppings = new Integer[N];
        BigInteger[] deliciousness = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            toppings[i] = sc.nextInt();
            deliciousness[i] = sc.nextBigInteger();
        }
        sc.close();
        System.out.println(sushi(N, selectSushis, toppings, deliciousness));
    }

    private static BigInteger sushi(int N, int selectSushis, Integer[] toppings, BigInteger[] deliciousness) {
        if(selectSushis > N) return BigInteger.ZERO;
        if(N < 1) return BigInteger.ZERO;
        if(N ==1) return deliciousness[0].add(BigInteger.valueOf(1));
        BigInteger tasty = BigInteger.ZERO;
        Set<Integer> integerSet = new HashSet<>();
        for(int i= 0; i<selectSushis;i++) {
            tasty=tasty.add(deliciousness[i]);
            integerSet.add(toppings[i]);
        }

        return tasty.add(BigInteger.valueOf(integerSet.size() * integerSet.size()));
    }

}