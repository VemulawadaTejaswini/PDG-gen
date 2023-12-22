import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		
		int x=A[0];int res=0;int i=0;int j=0;
		while(i<N) {
			if(A[i]==x) {
				i++;
				j++;
			}
			else {
				res+=j%2;
				j=0;
				x=A[i];
			}
		}
		System.out.println(res);
	}
}
