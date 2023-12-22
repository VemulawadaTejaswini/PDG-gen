import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int g[]= {4,6,9,11};
		if(x==2||y==2)System.out.println("No");
		else {
			int cnt=0;
			for(int i=0;i<g.length;i++) {
				if(g[i]==x)cnt++;
				if(g[i]==y)cnt++;
			}
			if(cnt==2 || cnt==0)System.out.println("Yes");
			else if(cnt==1)System.out.println("No");
		}
	}
}