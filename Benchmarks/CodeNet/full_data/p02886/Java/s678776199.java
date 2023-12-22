import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		//たこ焼きの数
		
		int[]o=new int[n];
		int ans=0;
		
		for(int i=0;i<n;i++) {
			o[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				ans+=o[i]*o[j];
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
