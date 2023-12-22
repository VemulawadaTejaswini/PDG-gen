import java.util.Scanner;
 


//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	String S =sc.next();
	int Q =sc.nextInt();
	int ans=0;
	int f;
	String g;
	StringBuffer str = new StringBuffer(S);
   //sre = str.reverse().toString();
	for(int i=0;i<Q;i++) {
		int t =sc.nextInt();
		if(t==1) {
			str=str.reverse();
		}else if(t==2) {
			f = sc.nextInt();
			g = sc.next();
			if(f==1) {
				str.insert(0,g);
			}else if(f==2) {
				str.append(g);
			}
			
			
		}
		
	}
	p(S);
	
	
	}
}