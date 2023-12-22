import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum1=0;
		int sum2=0;
		int ans1=0;
		int ans2=0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			sum1 += a;
			sum2 += a;
			if(i%2==0) {
				if(sum1 <= 0) {
					ans1 += (1-sum1);
					sum1=1;
				}
				if(sum2 >= 0) {
					ans2 += sum2+1;
					sum2=-1;
				}
			}else {
				if(sum1 >= 0) {
					ans1 += sum1+1;
					sum1 = -1;
				}
				if(sum2 <= 0) {
					ans2 += (1-sum2);
					sum2 = 1;
				}
			}
		}
		System.out.println(Math.min(ans1, ans2));
		sc.close();
	}

}


