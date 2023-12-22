package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diagonalstring{
	public static void main(String args[]) throws IOException{
		 String str[] = new String[9];
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 
		 for(int i=0;i<9;i++) {
			 str[i] = new String(in.readLine());
			 if (i!=8)System.out.println("next!");
		 }
		 
		 for(int i=0;i<9;i++) {
			 System.out.print(str[i]);
			 if (i%3==2) System.out.println();
		 }
		 
		 System.out.println(str[0] + str[4] + str[8]);
	}
}
