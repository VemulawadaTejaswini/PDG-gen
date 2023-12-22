import java.io.*;

import java.util.*;

public class Main {

	static Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in))) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = in.nextInt() ;
		int P = in.nextInt() ;
		int sum = A*3+P ;
		if(sum%2!=0){
			sum -= (sum%2) ;
		}
		System.out.println(sum/2);
	}

}