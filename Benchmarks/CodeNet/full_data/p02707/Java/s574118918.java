import java.util.LinkedList;
import java.util.Scanner;

class Main {
	int n;
	LinkedList<Integer> a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		a = new LinkedList<Integer>();
		for(int i=1;i<n;i++){
			a.add(sc.nextInt());
		}
	}

	void solve() {
		int[] bukaCnt = new int[n];
		while(a.size()>0){
			bukaCnt[a.pollFirst()-1]++;
		}
		for(int i:bukaCnt){
			System.out.println(i);
		}
	}
}