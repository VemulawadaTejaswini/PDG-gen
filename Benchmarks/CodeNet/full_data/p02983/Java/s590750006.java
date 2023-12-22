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
		 int L=sc.nextInt();
		 int R=sc.nextInt();
		 int res=200000;

		 int high;
		 int low_l=1000000;
		 int mem_l=L;
		 int low_r=1000000;



		 for(int l=L;l<R;l++) {
			if(l%2019<low_l) {
				low_l=l%2019;
				mem_l=l;
			}
			if(low_l==1) {
				break;
			}
		 }
		 for(int r=R;r>L;r--) {
			if((r%2019<low_r)&&r!=mem_l) {
				low_r=r%2019;
			}
		 }



		 System.out.println((low_l*low_r)%2019);
	 }
}