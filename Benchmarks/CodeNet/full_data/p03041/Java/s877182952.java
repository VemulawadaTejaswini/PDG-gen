import java.util.Scanner;


class Solve{
	static int INF = 10000;
	
	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 String str = sc.next();
		 StringBuilder sb = new StringBuilder(str);
		 if(str.charAt(k-1)=='A') {
			 sb.replace(k-1, k, "a");
		 }else if(str.charAt(k-1)=='B') {
			 sb.replace(k-1, k, "b");
		 }
		 else if(str.charAt(k-1)=='C') {
			 sb.replace(k-1, k, "c");
		 }
		 System.out.println(sb);

	}
}





public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}
