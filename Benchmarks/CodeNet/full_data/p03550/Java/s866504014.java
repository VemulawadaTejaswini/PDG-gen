
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int z=sc.nextInt();
		int w=sc.nextInt();
		Integer a[]=new Integer[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}

		int ans = -1;
		for(int i=0; i<n; i++) {
			int x=a[i];
			int min=i+1>=n ? Math.abs(x-w) : Math.abs(x-a[i+1]);
			for(int j=i+1; j<n; j++) {
				int y=a[j];
				min = Math.min(min, Math.abs(x-y));
			}
			ans = Math.max(ans, min);
		}
		System.out.println(ans);
		sc.close();
	}

}
