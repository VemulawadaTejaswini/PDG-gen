import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int K = Integer.parseInt(s.next());
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Long.parseLong(s.next()));
        }
        A = A.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<BigInteger> ret = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = A.size() - 1; i + 1 <= j; j--) {
                ret.add(BigInteger.valueOf(A.get(i)).multiply(BigInteger.valueOf(A.get(j))));
            }
        }
        ret = ret.stream().sorted().collect(Collectors.toList());
        System.out.println(ret.get(K - 1));
    }
}