import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean possible = true;
		int beforet = 0;
		int beforex = 0;
		int beforey = 0;
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			int step = Math.abs(x-beforex) + Math.abs(y-beforey);
			int time = t-beforet;
			if((step-time)%2 != 0 || step > time) {
				possible = false;
			}
			
			beforet = t;
			beforex = x;
			beforey = y;
		}
		
		System.out.println(possible? "YES" : "NO");

	}

}
