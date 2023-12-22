import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String s=sc.next();
		String t=sc.next();
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		String c=sc.next();
		if(s.equals(c)){
			a--;
		}
		else if(t.equals(c)){
			b--;
		}
		
		System.out.println(a+" "+b);
	}
}