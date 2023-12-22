import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){

		
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		int ans = a + b;
		if(ans > a + c){
			ans = a + c;
		}
		if(ans > b + c){
			ans = b + c;
		}
		System.out.println(ans);
  
	}
}