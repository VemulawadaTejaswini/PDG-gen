import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        char[] chars = s.toCharArray();

        List<Integer> listA = Stream.iterate(1, i -> i + 1)
                .limit(k)
                .collect(Collectors.toList());
        int[] ar1 = new int[listA.size()];
        int[] ar2 = new int[listA.size()];
        int[] ar3 = new int[listA.size()];
        ar1 = toArray(listA);
        ar2 = toArray(listA);
        ar3 = toArray(listA);
        int sum = 0;
        for (int n1 : ar1) {
            char s1 = chars[n1 - 1];
            for (int n2 : ar2) {
                char s2 = chars[n2 - 1];
                if (!(n1 < n2)) {
                    continue;
                }
                if(s1 == s2){
                    continue;
                }
                for (int n3 : ar3) {

                    if (!(n2 < n3)) {
                        continue;
                    }
                    char s3 = chars[n3 - 1];
                    if (s1 != s2 && s1 != s3 && s2 != s3) {
                        if (n2 - n1 != n3 - n2) {
                            sum += 1;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }

    private static int gcd(int[] args) {
        return IntStream.of(args)
                .mapToObj(BigInteger::valueOf) // 型変換
                .reduce(BigInteger::gcd) // Python版のreduce(math.gcd)とほぼ同じですね
                .orElse(BigInteger.ZERO) // ↑はOptional<BigInteger>を返すので
                .intValue();
    }

    public static int[] toArray(List<Integer> target) {

        final int[] result = new int[target.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }
}
