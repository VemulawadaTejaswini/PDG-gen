import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){

		int A,B;
		

		//////入力/////////
		Scanner stdIn = new Scanner(System.in);
		A = stdIn.nextInt();
		B = stdIn.nextInt();

		int ans = 1;
		int C = A;
		while(C < B){
			C += (A - 1);
			ans++;
		};

		System.out.println(ans);
		
		
	}
}