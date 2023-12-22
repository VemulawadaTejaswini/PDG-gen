import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long h = sc.nextLong();
        long w = sc.nextLong();
        long ans;
        if(h == 1 && w == 1){
          System.out.println(1);
          return;
        }
        if(h % 2 == 1 && w % 2 == 1){
          ans = h * w / 2 + 1;
        }else{
          ans = h * w / 2;
        }
        System.out.println(ans);
    }
}