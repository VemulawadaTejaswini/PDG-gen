import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double ans = 1;
		int N = scan.nextInt();
		double p = Math.pow(10,9);
		for(int i = 2; i <= N; i++) {
			ans = i * ans % (p + 7);	
		}
		scan.close();
		int rs = (int)ans;
		System.out.println(rs);
	}
}
