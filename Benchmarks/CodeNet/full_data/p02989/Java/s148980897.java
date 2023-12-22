import java.util.Arrays;
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
	 int N=sc.nextInt();
	 int[] d= new int[N];
	 for(int i=0;i<N;i++) {
		 d[i]=sc.nextInt();
	 }
	 Arrays.sort(d);
	 int half=(N/2)-1;

	 System.out.println(d[half+1]-d[half]);
	 


	 }
}