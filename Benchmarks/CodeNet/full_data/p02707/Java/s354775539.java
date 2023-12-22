import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	int n;
	HashMap<Integer,Integer> a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		a = new HashMap<Integer,Integer>();
		a.put(1, -1);
		for(int i=1;i<n;i++){
			a.put(i+1,sc.nextInt());
		}
	}

	void solve() {
		int[] bukaCnt = new int[n];
		for(int i=0;i<n;i++){
			for(int key:a.keySet()){
				if(a.get(key)==(i+1)){
					bukaCnt[i]++;
				}
			}
		}
		for(int i:bukaCnt){
			System.out.println(i);
		}
	}
}