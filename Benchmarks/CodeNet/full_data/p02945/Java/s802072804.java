import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();

		int a1 = a+b;
		int a2 = a - b;
		int a3 = a * b;

		if(a1 >= a2 && a1 >= a3){
			System.out.println(a1);
		}else

		if(a2 >= a1 && a2 >= a3){
			System.out.println(a2);
		}else

		if(a3 >= a1 && a3 >= a2){
			System.out.println(a3);
		}


	}
}