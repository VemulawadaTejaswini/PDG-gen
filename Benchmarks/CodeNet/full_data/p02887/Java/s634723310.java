import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String s=sc.next();
		char a=s.charAt(0);
		String op="";
		op+=a;
		for(int i=1;i<n;i++) {
			
			if(s.charAt(i)!=a) {
				op+=s.charAt(i);
				a=s.charAt(i);
			}
		}
	System.out.println(op.length());
	}
}
