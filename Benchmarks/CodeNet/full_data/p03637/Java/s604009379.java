import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt4 = 0;//4
		int cnt2 = 0;//2
		int cnt1 = 0;//other
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a%4==0) {
				cnt4++;
			} else if(a%2==0) {
				cnt2++;
			}
		}
		cnt1=n-cnt4-cnt2;
		if(cnt2>0) {
			cnt1++;
		}
		if(cnt1<=cnt4+1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
