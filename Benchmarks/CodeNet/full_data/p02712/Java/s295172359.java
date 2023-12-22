import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        // 合計値
        List<Integer> total = new ArrayList<Integer>();


        for (int i =0; i <= n; i++) {
            boolean fizz = i % 3  == 0;
            boolean buzz =  i % 5 == 0;
            if (fizz || buzz)  continue;

            fizz = false;
            buzz = false;
            total.add(i);
        }


        long sum = total.stream().reduce(0, Integer::sum);;

        System.out.println(sum);
    }
}