import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String S=s.next(),T=s.next();
		int A=s.nextInt(),B=s.nextInt();
		String U=s.next();
		System.out.println(U.equals(S)?(A-1)+" "+B:A+" "+(B-1));
	}
}