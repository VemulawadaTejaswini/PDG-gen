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
		 long A = sc.nextLong();
		 long B = sc.nextLong();
		 long C = sc.nextLong();
		 long D = sc.nextLong();

		 long last_d=0;
		 long last_cd=0;
		 long last_c,first_c,first_d,first_cd;

		 long gcd=getGCD(C,D);
		 long lcm=getLCM(C,D,gcd);
		 if(B%C==0) {
			 last_c=B/C;
		 }else {
			 last_c=B/C;
		 }
		 if(A%C==0) {
			 first_c=A/C;
		 }else {
			 first_c=A/C+1;
		 }

		 if(B%D==0) {
			 last_d=B/D;
		 }else {
			 last_d=B/D;
		 }
		 if(A%D==0) {
			 first_d=A/D;
		 }else {
			 first_d=A/D+1;
		 }

		 if(B%lcm==0) {
			 last_cd=B/lcm;
		 }else {
			 last_cd=B/lcm;
		 }
		 if(A%lcm==0) {
			 first_cd=A/lcm;
		 }else {
			 first_cd=A/lcm+1;
		 }



		 long c=last_c-first_c+1;
		 long d=last_d-first_d+1;
		 long cd=last_cd-first_cd+1;
		 long res=c+d-cd;


	//	 System.out.println(last_d);


		 System.out.println(B-A+1-res);
	}
	 private static long getGCD(long a,long b) {

		 if(b==0) return a;
			 return getGCD(b,a%b);
	 }
	 private static long getLCM(long a,long b,long gcd) {

		 return a*b/gcd;

		 }
}