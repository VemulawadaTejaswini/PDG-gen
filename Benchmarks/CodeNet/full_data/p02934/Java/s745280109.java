import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s[]=new int[n];
		double g=0;
		for(int i=0;i<n;i++) {
			s[i]=sc.nextInt();
			g+=1/(double)s[i];
		}
		g=1/g;
		System.out.println(g);
	}

}