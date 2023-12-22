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
		 int[] L = new int[M];
		 int[] R = new int[M];
		 int res = 0;
		 int l = 1;
		 int r = 100000;
		 for(int i = 0;i<M;i++) {
			 L[i] = sc.nextInt(); 
			 R[i] = sc.nextInt(); 
			 if(L[i]>=l) {
				 l=L[i];
			 }
			 if(R[i]<=r) {
				 r=R[i];
			 }
		 }
		 System.out.println(r-l+1);

		 }
}