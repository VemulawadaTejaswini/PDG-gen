import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if(N < K){
            Stream.generate(()->sc.nextInt()).limit(N);
            System.out.println(0);
        }else {
        long res = Stream.generate(()->sc.nextInt()).limit(N)
                .sorted().limit(N-K).collect(Collectors.summingLong(Integer::longValue));
            System.out.println(res);
        }
    }
}
