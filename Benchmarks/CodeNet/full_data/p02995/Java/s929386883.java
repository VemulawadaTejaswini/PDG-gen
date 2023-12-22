import java.math.BigInteger;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		BigInteger C = new BigInteger(sc.next());
		BigInteger D = new BigInteger(sc.next());

		BigInteger B_A = B.add(A.multiply(new BigInteger("-1"))).add(BigInteger.ONE);//A～Bまでの個数（B-A + 1）を求める

		//Cの約数の個数
		BigInteger c_y = yakusuu(A,B,C) ;

		//Dの約数の個数
		BigInteger d_y = yakusuu(A,B,D) ;

		//C*Dの約数の個数
		BigInteger cd_y = yakusuu(A,B,lcm(C,D)) ;

		//答え
		BigInteger count = B.subtract(A).add(BigInteger.ONE);//A～Bまでの個数（B-A + 1）を求める
		BigInteger ans = count.subtract(c_y).subtract(d_y).add(cd_y) ;

		System.out.println(ans.toString(10));
	}

	private BigInteger yakusuu(BigInteger start, BigInteger end, BigInteger num) {
		if(0 < num.compareTo(end)) {
			return BigInteger.ZERO ;
		}
		if(num.compareTo(end) == 0) {
			return BigInteger.ONE ;
		}

		BigInteger top ;

		if(start.mod(num).equals(BigInteger.ZERO)) {
			top = start ;
		}else {
			top = num.multiply(start.divide(num).add(BigInteger.ONE)) ;
		}

		BigInteger last ;
		if(end.mod(num).equals(BigInteger.ZERO)) {
			last = end ;
		}else {
			last = num.multiply(end.divide(num)) ;
		}

		BigInteger top_count = top.divide(num) ;
		BigInteger last_count = last.divide(num) ;

		BigInteger count = last_count.subtract(top_count.subtract(BigInteger.ONE)) ;


		return count ;
	}

	private BigInteger lcm(BigInteger m, BigInteger n) {
	    return m.multiply(n).divide(gcd(m, n));
	}
	private BigInteger gcd(BigInteger m, BigInteger n) {
	    if(m.compareTo(n) < 0) return gcd(n, m);
	    if(n.equals(BigInteger.ZERO)) return m;
	    return gcd(n, m.mod(n));
	}
}
