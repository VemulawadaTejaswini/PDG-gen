import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}


class Solve{


	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int N = sc.nextInt();
		 int M = sc.nextInt();
		 int L ;
		 int R ;
		 int res = 0;
		 int l = 1;
		 int r = 100000;
		 for(int i = 0;i<M;i++) {
			 L = sc.nextInt(); 
			 R = sc.nextInt(); 
			 if(L>=l) {
				 l=L;
			 }
			 if(R<=r) {
				 r=R;
			 }
		 }
		 if(l<=r) {
		 System.out.println(r-l+1);
		 }else {
			 System.out.println(0);
		 }
		 
		 }
}