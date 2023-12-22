
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		boolean notp[] = new boolean[55556];
		notp[0]=true;
		notp[1]=true;
		for(int i=2; i*i<=notp.length; i++) {
			if(!notp[i]) {
				for(int j=2; i*j<notp.length; j++) {
					notp[i*j]=true;
				}
			}
		}
		ArrayList<Integer> pl = new ArrayList<Integer>();
		for(int i=0; i<notp.length; i++) {
			if(!notp[i]&&i%5==1) {
				pl.add(i);
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(pl.get(i) + (i==n-1 ? "\n" :" "));
		}
		sc.close();
	}

}
