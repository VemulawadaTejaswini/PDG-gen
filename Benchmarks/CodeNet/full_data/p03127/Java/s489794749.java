import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int ans = a[0];

		while(true) {
			boolean ok=true;
			for(int i=0; i<n; i++) {
				int tmp=a[i]%ans;
				if(a[i]%ans != 0) {
					if(ans>tmp) {
						ok=false;
						ans=tmp;
						a[i]=tmp;
						break;
					}
				}
			}
			if(ok) {
				break;
			}
			Arrays.sort(a);
		}
		System.out.println(ans);
		sc.close();
	}

}
