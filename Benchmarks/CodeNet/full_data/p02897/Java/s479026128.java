import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double n = (double)sc.nextInt();
		System.out.println(Math.ceil(n/2)/n);
	}
}