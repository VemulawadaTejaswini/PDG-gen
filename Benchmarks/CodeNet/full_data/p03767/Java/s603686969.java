import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 
class Main {
	int n;
	LinkedList<Integer> a;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		a = new LinkedList<Integer>();
		for(int i=0;i<3*n;i++){
			a.add(sc.nextInt());
		}
	}
	void solve(){
		Collections.sort(a,Collections.reverseOrder());
		long sum = 0;
		for(int i=0;i<n;i++){
			a.remove(0);
			sum += a.remove(0);
		}
		System.out.println(sum);
	}
}