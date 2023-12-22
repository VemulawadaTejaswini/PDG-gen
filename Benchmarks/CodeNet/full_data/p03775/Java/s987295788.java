import java.util.Scanner;

class Main {
	long n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextLong();
	}

	void solve() {
		int root = (int)Math.pow(n, 0.5);
		long a,b;
		int min = Integer.MAX_VALUE;
		for(int i=1;i<=root;i++){
			if(n%i==0){
				a = i;b = n / i;
				min = Math.min(min, f(a,b));
			}
		}
		System.out.println(min);
	}
	int f(long a,long b){
		if(a>b){
			return String.valueOf(a).length();
		} else {
			return String.valueOf(b).length();
		}
	}
}