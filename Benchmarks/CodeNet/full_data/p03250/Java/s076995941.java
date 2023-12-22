
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		
	    if (A>=B&&A>=C) {
	    	System.out.println(A*10+B+C); 	
	    }
	    if (B>=A&&B>=C) {
	    	System.out.println(B*10+A+C);
	    }
		if(C>=A&&C>=B) {
			System.out.println(C*10+A+B);
			
		}
	}

}