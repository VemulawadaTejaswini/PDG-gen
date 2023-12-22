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
		for(int i=1;i<n-1;i++) {
			if(Math.max(p[i-1], Math.max(p[i], p[i+1])) != p[i]
					&& Math.min(p[i-1], Math.min(p[i], p[i+1])) != p[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}