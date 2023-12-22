import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // 税込価格
        int n = Integer.parseInt(sc.next());
        BigDecimal bign = BigDecimal.valueOf(n);
        // 消費税率1.08円
        BigDecimal consumption_tax = BigDecimal.valueOf(1.08);
        // 税抜価格の存在フラグ
        boolean exist_flg = false;
        // 税抜価格をi円と仮定(税込価格がn円のため、税抜価格はn以下の想定)
        for (int i = 1; i <= n; i++) {
            BigDecimal x = BigDecimal.valueOf(i);
            // 税抜価格 * 1.08(小数点以下切り捨て) = 仮定の税込価格
            BigDecimal value = x.multiply(consumption_tax).setScale(0, RoundingMode.DOWN);
            // 仮定の税込価格とnが一致する場合
            if (value.equals(bign)) {
                exist_flg = true;
                out.println(x);
                break;
            }
        }
        // 税抜価格を計算できなかった場合
        if (!exist_flg) {
            out.println(":(");
        }
        sc.close();
        out.close();
    }

}