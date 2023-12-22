import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[N-1]-a[0]);
	}

}
