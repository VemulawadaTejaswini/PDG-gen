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
		int check=-1;
		for(int i=0;i<n;i++) {
			if(i+1!=p[i]) {
				cnt++;
				if(check==-1)check=p[i];
				else {
					p[i]=check;
				}
				if(cnt>2)break;
			}
		}
		if(cnt==0||cnt==2)System.out.println("YES");
		else System.out.println("NO");
	}
}