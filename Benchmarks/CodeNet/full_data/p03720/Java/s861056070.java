import java.util.Scanner;
 
class Main {
	int n;
	int m;
	int[] ab;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		m = sc.nextInt();
		ab = new int[2*m];
		for(int i=0;i<2*m;i+=2){
			ab[i] = sc.nextInt();
			ab[i+1] = sc.nextInt();
		}
	}
	void solve(){
		int[] c = new int[n];
		for(int i=0;i<2*m;i++){
			c[ab[i]-1]++;
		}
		for(int i:c){
			System.out.println(i);
		}
	}
}