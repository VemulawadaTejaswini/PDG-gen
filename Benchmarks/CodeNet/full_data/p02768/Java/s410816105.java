import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int bad1 = scanner.nextInt();
		int bad2 = scanner.nextInt();
		
		int ans =0;
		for(int j=1; j<=total; j++) {
			if(j!=bad1 && j!=bad2) {
				ans += calcC(total,j);				
			}
		}
		System.out.println(ans);
		
	}	
	
	//組み合わせの計算
	public static int calcC(int n, int k) {
		
		return calcn(n)/(calcn(k)*calcn(n-k));
	}
	
	//階乗の計算
	public static int calcn(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		int ans =1;
		for(int ele: list) {
			ans = ans*ele;
		}
		return ans;
	}
	

}