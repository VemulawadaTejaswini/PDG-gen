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
		 int A = sc.nextInt();
		 int P = sc.nextInt();
		 int res = 0;
		 res=(A*3+P)/2;
		 System.out.println(res);
		 
		 
		 }
}