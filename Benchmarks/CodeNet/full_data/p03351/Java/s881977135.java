import java.io.*;
import java.util.*;

public class Main{

     public static void main(String []args)/*throws IOException*/{
        
        /*
        InputStreamReader reader=new InputStreamReader(System.in);
 
        BufferedReader input =
			new BufferedReader (new InputStreamReader (System.in));
			
		int key = reader.read();
		String str = input.readLine();
		*/
		Scanner stdIn = new Scanner(System.in);
		
		int a,b,c,d;
		
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();
		d = stdIn.nextInt();
		
		String ans = "No";
		if(c - a <= d || (b - a <= d && c - b <= d)){
		  ans = "Yes";
		}
		
		System.out.println(ans);
	
     }
}
