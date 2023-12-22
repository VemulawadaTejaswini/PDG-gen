import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int x=0;
		for (int i=0; i<=S.length(); i++) {
            for (int j=0; j<=S.length(); j++) {
            	if(i>=j) continue;
            	String A = S.substring(i,j);
            	long B = Long.parseLong(A);
            	if((B % 2019)==0) {
            		x++;
            	}
            }
		}
		System.out.println(x);
	}
}