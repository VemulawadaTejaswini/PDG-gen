import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
	int A =sc.nextInt();
	int B =sc.nextInt();
	int ans=0;
	
	double AA=A/0.08;
	double BB=B/0.10;
	double AAA=(A+1)/0.08;
	double BBB=(B+1)/0.10;
	boolean a=true;
	//p("AA"+AA+"BB"+BB+"AAA"+AAA+"BBB"+BBB);
	//AA~AAAの間であり、BB~BBBの間である数を求める
	for(int i=1;i<=2000;i++) {
		if(AA<=i&&AAA>i&&BB<=i&&BBB>i) {
			System.out.println(i);
			a=false;
			break;
		}
	}
	
	if(a) {
		p(-1);
	}
	
	
	}
}