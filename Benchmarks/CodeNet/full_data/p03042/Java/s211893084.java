import java.util.Scanner;


class Solve{
	static int INF = 10000;
	
	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int S = sc.nextInt();
		 int f=S/100;
		 int b = S%10+((S/10)%10)*10;
		 
		 if(b>0 &&b<=12) {
			 
			 if(f==0||f>12) {
				 System.out.println("YYMM");
				 
			 }else {
				 System.out.println("AMBIGUOUS");
			 }
		 }else if(f>=1&&f<=12) {
			 if(b==0||b>12) {
				 System.out.println("MMYY");
			 }else {
				 System.out.println("AMBIGUOUS");
			 }
		 }else {
			 System.out.println("NA");
		 }
		 
		 

;
	}
}





public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}