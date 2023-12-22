import java.util.*;
public class Main {
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("Even");
		list.add("Odd");
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		
		System.out.println(list.get(a*b % 2));

	}
}