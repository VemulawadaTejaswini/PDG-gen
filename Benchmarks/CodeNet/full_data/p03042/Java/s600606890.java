//Java8(OpenJDK 1.8.0)
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();
	}

}
class Solve{
	 Scanner sc = new Scanner(System.in) ;
	 void solve() {
		 int S =sc.nextInt();
		 int s_1 = S/100;		//先頭2文字
		 int s_2 = S%100;		//後ろ2文字

		 if(s_1>0 && s_1<13) {
			 if(s_2>0 && s_2<13) {
				 System.out.println("AMBIGUOUS");
			 }else {
				 System.out.println("MMYY");
			 }
		 }else {
			 if(s_2>0 && s_2<13) {
				 System.out.println("YYMM");
			 }else {
				 System.out.println("NA");
			 }
		 }
	 }
}