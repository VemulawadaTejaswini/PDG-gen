import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		String s="";
		int n,m;
		s=s+String.valueOf(S.charAt(0));
		s=s+String.valueOf(S.charAt(1));
		n=Integer.parseInt(s);
		s="";
		s=s+String.valueOf(S.charAt(2));
		s=s+String.valueOf(S.charAt(3));
		m=Integer.parseInt(s);
		if(1<=n&&n<=12){
			if(1<=m&&m<=12){
				System.out.println("AMBIGUOUS");
			}
			else{
				System.out.println("MMYY");
			}
		}
		else if(1<=m&&m<=12){
			System.out.println("YYMM");
		}
		else
			System.out.println("NA");
	}

}