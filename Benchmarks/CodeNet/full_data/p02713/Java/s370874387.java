import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Integer> listA = Stream.iterate(1 , i -> i+1)
                .limit(k)
                .collect(Collectors.toList());
        int[] ar1 = new int[listA.size()];
        int[] ar2 = new int[listA.size()];
        int[] ar3 = new int[listA.size()];
        ar1 = toArray(listA);
        ar2 = toArray(listA);
        ar3 = toArray(listA);
        long sum = 0;
        for(int n1 : ar1){
            for(int n2 : ar2){
                for(int n3 : ar3){
                    int[] array = {n1, n2, n3};
                    sum +=gcd(array);
                }
            }
        }
        System.out.println(sum);


    }

    private static int gcd(int[] args){
        return IntStream.of(args)
                .mapToObj(BigInteger::valueOf) // 型変換
                .reduce(BigInteger::gcd) // Python版のreduce(math.gcd)とほぼ同じですね
                .orElse(BigInteger.ZERO) // ↑はOptional<BigInteger>を返すので
                .intValue();
    }

    public static int[] toArray(List<Integer> target) {

        final int[] result = new int[target.size()];
        for (int i=0; i<result.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }
