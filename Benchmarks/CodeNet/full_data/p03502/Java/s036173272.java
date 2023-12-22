import java.util.Scanner;
 
class Main {
	int n;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
	}
	void solve(){
		int sum = 0;
		int x = n;
		while(n>0){
			sum += n%10;
			n /= 10;
		}
		if((x%sum)==0){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}