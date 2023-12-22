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
		 String N = sc.next();
		 int win =0;

		 for(int i=0;i<N.length();i++) {
			 char ch=N.charAt(i);
			 if(ch=='o') {
				 win++;
			 }
		 }

		 if(win+15-N.length()>=8) {
		 System.out.println("YES");
		 }else {
		 System.out.println("NO");
		 }

	 }
}