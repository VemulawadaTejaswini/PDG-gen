import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(
            IntStream.range(0, sc.nextInt()) //生成処理
                 .map(i -> sc.nextInt() -1) //中間処理
                 .sum() //末端処理
        );

        // a1で割ったあまりの最大値はa1 - 1
        // この時、m = (a1 - 1)(a2 - 1)...(an - 1) で求められる
        

        sc.close();
    }
}
