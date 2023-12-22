	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,k,count,m,answer,index;
		float ans;
		String s,t;
		
			// 整数の入力
		
		n = sc.nextInt();
		k = sc.nextInt();
		count=0;
		
		for(index=0;index<n;index++) {
			m = sc.nextInt();
			if(m>=k) {
				count++;
			}
		}
		sc.close();
		System.out.print(count);

			// 出力
 
	}
}	