import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd= new Scanner(System.in);
		int n = vd. nextInt();
		int[] l = new int[n];
		for(int i=0; i<n;i++) l[i] = vd.nextInt()-i;
		vd.close();
		
		int sum = 0;
		for(int i=0; i<n;i++) sum=sum+l[i];
		int avU =sum/n + 1;
		int avD =sum/n;
		
		int a = sum - avU*n;
		int b = sum - avD*n;
		System.out.println(Math.min(a, b));
		
		
	}

}
