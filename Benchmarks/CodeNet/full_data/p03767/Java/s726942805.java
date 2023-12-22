import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[3*n];

		for(int i =0;i<n;i++){
			a[3*i]=scan.nextInt();
			a[3*i + 1]=scan.nextInt();
			a[3*i + 2]=scan.nextInt();
		}

		Arrays.sort(a);

		long strength=0;
		for(int i=0;i<n;i++){
			strength+=a[3*n-2 -2*i];
		}
		System.out.println(strength);

	}

}
