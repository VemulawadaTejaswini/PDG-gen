import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		int t=1;
		int min=a[0];
		for(int i=1;i<N;i++) {
			if(min>a[i]) {
				t++;
				min=a[i];
			}
		}
		System.out.println(t);
	}
}
