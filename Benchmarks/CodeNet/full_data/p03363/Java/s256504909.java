import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int A[]=new int[N+1];
		A[0]=0;
		int co=0;
		for(int i=1;i<N+1;i++) {
			co+=scan.nextInt();
			A[i]=co;
		}
		int ans=0;
		for(int i=0;i<N+1;i++) {
			for(int j=i+1;j<N+1;j++) {
				if(A[i]==A[j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
