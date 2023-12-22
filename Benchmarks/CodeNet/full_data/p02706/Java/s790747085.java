import java.util.Scanner;

class Main {
	int n;
	int m;
	int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		for(int i=0;i<m;i++){
			a[i] = sc.nextInt();
		}
	}

	void solve() {
		for(int i:a){
			n-=i;
		}
		System.out.println(n>=0?n:-1);
	}
}