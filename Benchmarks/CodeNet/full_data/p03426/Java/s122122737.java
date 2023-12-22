
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		
		int n = h*w;
		
		Data []data = new Data [n+1];
		
		for(int i = 0 ;i < h ;i++) {
			for(int j = 0 ; j < w ;j++) {
				int a = Integer.parseInt(sc.next());
				data[a] = new Data(i+1,j+1);
				}
			}
		
		int []sum = new int [n+1];
		
		for(int i = d+1 ;i <= n ;i++) {
				int p = data[i].geth() - data[i-d].geth();
				int q = data[i].getw() - data[i-d].getw();
				
				int P = Math.abs(p);
				int Q = Math.abs(q);
				
				sum[i] = sum[i-d] + P + Q;
		}
		
		int q = Integer.parseInt(sc.next());
		int []ans = new int [q];
		
		for(int i = 0 ;i < q ;i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			ans[i] = sum[r] - sum[l];
		}
		

		for(int i = 0 ;i < q ;i++) {
			System.out.println(ans[i]);
		}
	

	}	
}
class Data{
	
	private int h;
	private int w;
	
	public Data(int h,int w) {
		this.h = h;
		this.w = w;
	}
	
	public int geth() {
		return h;
	}
	public int getw() {
		return w;
	}
}
