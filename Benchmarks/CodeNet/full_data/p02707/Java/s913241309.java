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
		a[0] = -1;
		for(int i=1;i<n;i++){
			a[i] = sc.nextInt();
		}
	}

	void solve() {
		int[] bukaCnt = new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[j]==(i+1)){
					bukaCnt[i]++;
				}
			}
		}
		for(int i:bukaCnt){
			System.out.println(i);
		}
	}
}