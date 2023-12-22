import java.util.Scanner;

class Main {
	int n;
	int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
	}

	void solve() {
		long cnt1 = (a[0]>0)?0:(Math.abs(a[0])+1);
		int sign = 1;
		long sum = (a[0]>0)?a[0]:1;
		for(int i=1;i<n;i++){
			sum += a[i];
			if(sum*sign>=0){
				cnt1 += Math.abs(sum) + 1;
				sum = -sign;
			}
			sign *= -1;
		}
		
		long cnt2 = (a[0]<0)?0:(Math.abs(a[0])+1);
		sign = -1;
		sum = (a[0]<0)?a[0]:-1;
		for(int i=1;i<n;i++){
			sum += a[i];
			if(sum*sign>=0){
				cnt2 += Math.abs(sum) + 1;
				sum = -sign;
			}
			sign *= -1;
		}

		System.out.println(Math.min(cnt1, cnt2));
	}
}