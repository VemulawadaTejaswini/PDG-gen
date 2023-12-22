import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result =m/n;
		for(int i=m/n+1;i>1;i--){
			int amari =m%i;
			// System.out.print("今は"+i+"で余りは");
			if(amari==0||amari==i){
				result = i;
				System.out.println(result);
				break;
			}
			// System.out.println("result"+result);
		}
		// System.out.println(result);
	}
}