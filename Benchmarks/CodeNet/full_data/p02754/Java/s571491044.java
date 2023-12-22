import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long N = sc.nexyLong();
      	long A = sc.nextLong();
      	long B = sc.nextLong();
      	
      	long blue=N/(A+B);
		blue=Math.ceil(blue*A);
      	System.out.println(blue);
	}
}
