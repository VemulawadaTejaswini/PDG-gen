import java.text.MessageFormat;
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
		 double N = sc.nextInt();
		 double K = sc.nextInt();
		 double n=0d;
		 double res=0d;


		 String message;


		 for(double i = 1;i<=N;i++) {

			 for(int j = 0;j<100000;j++) {//jに何回2をかけるとKを超えるか
				 if(i*Math.pow(2, j)>=K) {
					 n=j;
					 j=100000;
				 }
			 }
			 res+=1/(N*Math.pow(2, n));//確率計算

		 }
			 message = MessageFormat.format("{0,number,0.000000000000} ", res);

			 System.out.println(message);


		 }
}