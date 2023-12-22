import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	long N =sc.nextInt();
	long R =sc.nextInt();
	long g=0;
	boolean a=true;
		for(int d=0;a;d++) {
			g+=(long)Math.pow(R, d)*(R-1);
			if(g>=N) {
					p(d+1);
					a=false;
				}
			
		}
		
		
	}
}