import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        // 処理
        String out = (Math.sqrt(a) + Math.sqrt(b) ) < Math.sqrt(c) ? "Yes" : "No";

        // 出力
        System.out.println(out);
    }
}