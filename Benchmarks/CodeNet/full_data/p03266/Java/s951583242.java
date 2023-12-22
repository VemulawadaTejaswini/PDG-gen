
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long cnt1=0;
		long cnt2=0;
		for(int i=1; i<=n; i++) {
			if(k%2==1) {
				if(i%k==0) {
					cnt1++;
				}
			}else {
				if(i%k==0) {
					cnt1++;
				}else if(i%(k/2)==0) {
					cnt2++;
				}
			}
		}
		cnt1 = (long)Math.pow(cnt1, 3);
		cnt2 = (long)Math.pow(cnt2, 3);
		System.out.println(cnt1+cnt2);
		sc.close();
	}

}
