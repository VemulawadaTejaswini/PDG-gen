import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);

		int n=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
		}
		long ans = 0;
		long count=0;
		for(int i=1;i<n;i++) {
			if(h[i-1]>=h[i]) {
				count++;
			}
			else {
				ans=Math.max(ans, count);
				count=0;
			}
		}
		ans=Math.max(ans, count);
		
		System.out.println(ans);







	}


}


