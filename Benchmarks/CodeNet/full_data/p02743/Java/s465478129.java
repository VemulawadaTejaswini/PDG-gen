import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        // 主処理
        BigDecimal valA = new BigDecimal(a).sqrt(MathContext.DECIMAL128);
        BigDecimal valB = new BigDecimal(b).sqrt(MathContext.DECIMAL128);
        BigDecimal valC = new BigDecimal(c).sqrt(MathContext.DECIMAL128);
        BigDecimal remain = valC.subtract(valA);
        boolean judge = 0 < remain.compareTo(valB);
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }

}
