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
		
		int x;
		
		x = stdIn.nextInt();
		int _x = (int)Math.sqrt(x);
		
		int ans = _x * _x;
		
		System.out.println(ans);
	
     }
}