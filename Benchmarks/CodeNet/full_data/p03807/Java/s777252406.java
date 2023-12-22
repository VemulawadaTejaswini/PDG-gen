import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int count=0;
		// 文字列の入力
		int first = sc.nextInt();
		if(first==1){
			int ppp = sc.nextInt();
			System.out.println("YES");
			return;
		}
		for(int k=0;k<first;k++){
			int ttt = sc.nextInt();
			//奇数→countに1足す
			if(ttt%2==1){
				count++;
			}
		}
		if(count%2==1){
			System.out.println("NO");
		}else{
		// 出力
		System.out.println("YES");
		}
	}
}
