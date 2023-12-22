import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n-1;i++) {
			b[i]=scan.nextInt();
		}
		scan.close();
		int sum=b[0]+b[n-2];
		for(int i=1;i<n-1;i++) {
			sum+=Math.min(b[i-1],b[i]);
		}

		System.out.println(sum);
	}

}