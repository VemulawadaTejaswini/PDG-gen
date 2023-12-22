import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Solve s= new Solve();
		s.solve();
	}

}
class Solve{
	 Scanner sc = new Scanner(System.in) ;

	 void solve() {
	 int s=sc.nextInt();
	 int a,b;
	 boolean res=true;
	 b=99;
	 for(int i=0;i<4;i++) {
		 a=s%10;
       	s=s/10;
		 if(a==b) {
			 res=false;
		 }
		 b=a;
	 }
	 if(res==true) {
		 System.out.println("Good");
	 }else {
		 System.out.println("Bad");
	 }
	 }
}