import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);	
			
			int hoge = sc.nextInt();
			System.out.println(Go_Home(hoge));

		    sc.close(); }
	
	public static int Go_Home(int n) {
		int ans = 0;
		while((ans + 1)*ans/2 < n){
			ans++;
		}
		return ans;
	}
}
