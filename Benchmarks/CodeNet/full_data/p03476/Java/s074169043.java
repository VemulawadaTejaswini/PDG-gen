
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	boolean p[] = new boolean[100001];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int q=sc.nextInt();

		for(int i=0; i<=100000; i++) {
			p[i]=true;
		}

		p[0]=false;
		p[1]=false;
		for(int i=2; i*i<=100000; i++) {
			if(p[i]) {
				for(int j=i+i; j<=100000; j+=i) {
					p[j]=false;
				}
			}
		}

		int sum[]= new int[100001];
		sum[0]=0;
		for(int i=0; i<100000; i++) {
			if(i%2==0) {
				sum[i+1] = sum[i];
			}else {
				if(p[i] && p[(i+1)/2]) {
					sum[i+1] = sum[i]+1;
				}else {
					sum[i+1] = sum[i];
				}
			}

		}

		for(int i=0; i<q; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int ans = sum[r+1] - sum[l];
			System.out.println(ans);
		}

		sc.close();
	}

}
