import java.util.*;
import java.math.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 入力
	int a = sc.nextInt();
	BigDecimal res = new BigDecimal("0");
    
    for(int i=1;i<=a;i++) {
        if(i%5 == 0 || i%3 == 0) {
            continue;
        } else {
            res = res.add(BigDecimal.valueOf(i));
        }
    }
	// 出力
    System.out.print(res.toPlainString());
	}
}