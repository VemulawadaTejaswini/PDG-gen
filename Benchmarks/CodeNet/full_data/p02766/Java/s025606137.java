

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		
	
	
	
	final String base36 = Integer.toString(N, K);
	
	System.out.println(base36.length());
	
}
}

