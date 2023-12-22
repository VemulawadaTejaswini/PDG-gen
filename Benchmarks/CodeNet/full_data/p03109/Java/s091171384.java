import java.util.*;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] A = S.split("/");
		int year = Integer.parseInt(A[0]);
		int month = Integer.parseInt(A[1]);
		int day = Integer.parseInt(A[2]);
		if(month <= 4) {
			System.out.println("Heisei");
			
		}
		else {
			System.out.println("TBD");
			
		}
		
		
		
	}

	
}