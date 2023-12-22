import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 1;
		int k = Math.min(a, b);
		
	for ( int i = 1; i <= k ;i++) {
		if(a % i == 0 && b % i == 0) 
			max = i;
	     }
	
	    if(c % max == 0) 
	    	System.out.println("Yes");
	    else
	    	System.out.println("No");
	    }
		
	
	}


