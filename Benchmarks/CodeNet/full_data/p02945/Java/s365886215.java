
// 問題URL
//

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        Integer y = Integer.parseInt(scanner.next());

        Integer kakeru = x * y;
        Integer tasu = x + y;
        Integer hiku = x - y;
        Integer kekka= Math.max(kakeru,tasu);
        System.out.println(Math.max(kekka, hiku));

    }
}