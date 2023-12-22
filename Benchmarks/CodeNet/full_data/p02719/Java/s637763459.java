import java.util.*;
import java.math.BigInteger;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	String ntmp = sc.next();
	BigInteger n = new BigInteger(ntmp);
	BigInteger k = new BigInteger(sc.next());
	BigInteger bfr = n;
	BigInteger res = n.subtract(k);
	BigInteger zero = new BigInteger("0");
	BigInteger m1 = new BigInteger("-1");
	
	while (true) {
    	res = bfr.subtract(k);
    	int com = res.compareTo(zero);
    	if(com == -1) res = res.multiply(m1);
    	int com2 = res.compareTo(bfr);
    	if(com2 == 0 || com2 == 1) break;
    	bfr = res;
	}
	// 出力
	System.out.print(bfr);
	}
}