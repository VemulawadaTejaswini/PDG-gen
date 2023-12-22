import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		String res=BigDecimal.valueOf((b*Math.pow(b-1, a-1))).toPlainString();
		if(res.substring(res.length()-2, res.length()-1).equals(".")) {
			System.out.println(res.substring(0, res.length()-2));//BigDecimal.valueOf(d1).toPlainString()
		}else {
			System.out.println(res);
		}
	}
}

