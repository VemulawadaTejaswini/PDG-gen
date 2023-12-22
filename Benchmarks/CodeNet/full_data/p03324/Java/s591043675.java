import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int d = sc.nextInt();
		int n = sc.nextInt();
        int value = (int)Math.pow(100, d);
    
		// 出力
		System.out.println(d == 0 ? n : value * n);
	}
}