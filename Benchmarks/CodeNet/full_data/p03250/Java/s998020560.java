import java.util.Scanner;
public class Main {
	int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}
	
	void test(Scanner sc){
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int max = A>B?A:B;
		max = max>C?max:C;
		int ans=0;
		if(max == A){
			ans = A * 10 + B + C;
		}else if(max == B){
			ans = B * 10 + A + C;
		}else{
			ans = C * 10 + B + A;
		}
		System.out.println(ans);
	}
}
