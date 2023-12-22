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
		 int r = sc.nextInt();
		 int D = sc.nextInt();
		 int x2000 = sc.nextInt();
		 int res = r*x2000-D;
		 int res2 = 0;
		 System.out.println(res);
		 
		for(int i = 0;i<9;i++) {
			 res2 = r*res-D;
			 res = res2;
			 System.out.println(res2);
		}
		 
		 
		 
		 System.out.println(res);




		 }
}