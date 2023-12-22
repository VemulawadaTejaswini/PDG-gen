
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 String a=br.readLine();
		 int n =Integer.valueOf(a);
		 BufferedReader br1 = new BufferedReader (new InputStreamReader(System.in));
		 String b=br1.readLine();
		 int z =Integer.valueOf(b);
		 
		 if(n==1) {
			 if(z==2) {
				 System.out.print("3");
			 }
			 else if(z==3) {
				 System.out.print("2");
			 }
		 }
		 
		 if(n==2) {
			 if(z==1) {
				 System.out.print("3");
			 }
			 else if(z==3) {
				 System.out.print("1");
			 }
		 }
	}

}
