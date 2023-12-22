import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=scan.nextInt();
		}
		scan.close();

		int cnt=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(min>p[i]) {
				cnt++;
				min=p[i];
			}
		}
		System.out.println(cnt);
	}
}