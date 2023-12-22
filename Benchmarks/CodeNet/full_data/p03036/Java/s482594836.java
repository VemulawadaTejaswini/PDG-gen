import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数型を宣言して読み込む
		int r = sc.nextInt();
		int D = sc.nextInt();			
		int x2000 = sc.nextInt();				
		int ans=x2000;
		for (int i=0;i<10;i++){
		ans=r*ans-D;		
		System.out.println(ans);
		}
	}
}