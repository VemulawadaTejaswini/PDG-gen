import java.util.*;
import java.lang.*; 
 
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextInt();
		long b = scan.nextInt();
		long c = scan.nextInt();
		
		long uhen= (c-a-b)*(c-a-b);
		long sahen = 4*a*b;
		
		if(c-a-b<=0){
		 System.out.println("No");
		}
		else{
		if(sahen < uhen){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		}
	}
}