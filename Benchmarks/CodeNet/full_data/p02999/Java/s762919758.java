import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int a = sc.nextInt();
		// 出力
		if(x < a){
			System.out.println(0);
		}else{
			System.out.println(10);
		}
	}
}