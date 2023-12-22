import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		 String str[] = new String[9];
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 
		 for(int i=0;i<9;i++) {
			 str[i] = new String(in.readLine());
		 }
		 
		 System.out.println("\n" + str[0] + str[4] + str[8]);
	}
}
