import java.util.*;
public class Main {
	public static void main(String[] args){
		StringBuilder buff = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		while(true) {
		if(a!=0) {
			buff.append("a");
			a--;
		}else if(c!=0) {
			buff.append("c");
		}else if(b!=0) {
			buff.append("b");
		} else {
			System.out.println(buff);
			return;
		}
		}
	}
}