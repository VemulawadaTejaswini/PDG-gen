import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
	int N =sc.nextInt();
	int A =sc.nextInt();
	int B =sc.nextInt();
	int ans=0;
		ans+=((int)N/(A+B))*A;
		if(A-N%(A+B)>0) {
			ans+=N%(A+B);
		}else if(A-N%(A+B)<=0) {
			ans+=A;
		}
	p(ans);
	
	
	}
}