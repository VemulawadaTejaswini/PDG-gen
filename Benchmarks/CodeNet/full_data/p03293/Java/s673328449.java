import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		String b = sc.next();
		int length = a.length();
		// スペース区切りの整数の入力
		// 文字列の入力
		String afterA = a;

		for(int i=0;i<length;i++){
			char charA = afterA.charAt(length-1);
			afterA = charA+ afterA.substring(0, length-1);
			if(afterA.equals(b)){
			System.out.println("Yes");
			return;
			}
		}
			
System.out.println("No");
		
	}
}