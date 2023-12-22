import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
			b[i] = a[i];
		}

		Arrays.parallelSort(a);

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]==b[j]) {
					System.out.print(j+1+" ");
				}
			}
		}

	}

}
