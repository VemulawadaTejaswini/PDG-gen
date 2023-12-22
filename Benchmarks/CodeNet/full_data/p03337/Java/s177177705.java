
import java.io.*;
import java.util.*;

public class Msin {
  public static void main( String[] args ) {
	  int a,b,x,y,z;
//InputStreamReader isr = new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
/*	  BufferedReader br = new BufferedReader(scan);
try{
	String buf = br.readLine();
	a = Integer.parseInt(buf);
//	System.out.print("b = ");
	buf = br.readLine();
	b = Integer.parseInt(buf);
}catch(Exception e){
    a = 0;
	b = 0;
}
*/
   a = scan.nextInt();
   b = scan.nextInt();
   x = a + b;
   y = a - b;
   z = a * b;
   
int values[] = {x, y, z};
int max      = values[0];
for (int index = 1; index < values.length; index ++) {
	 max = Math.max(max, values[index]);
     }
	  System.out.println ( max );
  }
}
