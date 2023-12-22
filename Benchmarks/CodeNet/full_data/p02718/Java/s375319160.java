import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n種類の商品
		int m=sc.nextInt();		//人気商品n個
		int a=0;
		
		ArrayList<Integer>array=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int b=sc.nextInt();	
			array.add(b);
			a=a+b;		//総投票数計算
		}
		
		int c=(a+4*m-1)/(4*m);
		int count=0;
		
		
		
		for(int i:array) {
			if(i>=c) {
				count++;
			}
		}
		
		if(count>=m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			}
		
		sc.close();
	}

}