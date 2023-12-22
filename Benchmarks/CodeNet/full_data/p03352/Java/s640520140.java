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
		
		int __x = (int)Math.cbrt(x);
		
		int _ans = __x * __x* __x;
		
		if(ans < _ans)
		    ans = _ans;
		    
		if(x % 10 == 0 && x > 10)
		    ans = x;
		System.out.println(ans);
	
     }
}
