
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer K = Integer.parseInt(scanner.next());

        Integer count = 0;
        Double total = 0.0;
        for (int i = 1; i < N+1; i++) {
            Integer ii = i;
            while(ii < K) {
                ii*=2;
                count++;
            }
            total += (double)1/N * Math.pow((double)1/2,count);

            // 初期化
            ii = i;
            count = 0;
        }


        System.out.println(total);
    }
}
