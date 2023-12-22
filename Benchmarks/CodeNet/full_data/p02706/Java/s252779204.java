import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//夏休みの日数
		int m=sc.nextInt();		//夏休みの宿題の数
		int count=0;
		
		for(int i=0;i<m;i++) {
			int m1=sc.nextInt();	//1番目の宿題
			count=count+m1;
		}
		
		count=n-count;
		
		if(count>=0) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}
		
		sc.close();
	}

}