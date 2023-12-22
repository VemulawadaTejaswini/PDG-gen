
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d[]=new int[n];
		for(int i=0;i<n;i++) {
			d[i]=scan.nextInt();
		}
		scan.close();
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j)sum+=d[i]*d[j];
			}
		}
		System.out.println(sum/2);
	}
}