import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a-1;
		int d = b-1;
		
		//偶数にならない
		if(a<=1){a=0;}
		else{
		    a = ((a * c)/2);
		}
		if(b<=1){b=0;}
		else{
		     b = ((b * d)/2);
		}
		
		System.out.print(a+b);
      
	}
}