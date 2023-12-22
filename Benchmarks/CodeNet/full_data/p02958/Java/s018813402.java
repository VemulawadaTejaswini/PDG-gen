import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[] =new int[n];


		int cnt=0;
		for(int i=0; i<n; i++) {
			p[i]=sc.nextInt();
			if(i>0 && p[i-1]>p[i]) {
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("YES");
			sc.close();
			return;
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int tmp = p[j];
				p[j] = p[i];
				p[i] = tmp;
				cnt=0;
				for(int k=0; k<n; k++) {
					if(k>0 && p[k-1]>p[k]) {
						cnt++;
					}
				}
				if(cnt==0) {
					System.out.println("YES");
					sc.close();
					return;
				}
				tmp = p[j];
				p[j] = p[i];
				p[i] = tmp;
			}
		}
		System.out.println("NO");
		sc.close();
	}
}
