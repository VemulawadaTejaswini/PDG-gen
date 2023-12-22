import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        long cnt = Stream.generate(()->sc.nextInt())
                .limit(N)
                .filter(a -> a%2==0)
                .filter(a -> a % 3 != 0 && a % 5 != 0)
                .count();
        if(cnt == 0)
            System.out.println("APPROVED");
        else
            System.out.println("DENIED");
    }
}