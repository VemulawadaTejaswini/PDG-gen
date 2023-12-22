import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String str = br.readLine();
		String z[] = str.split(" ",0);
		int a = (int)Integer.parseInt(z[0]);
		int b = (int)Integer.parseInt(z[1]);
		if(a <= 0 && b >=0){
			System.out.println("Zero");
		} else if(a > 0){
			System.out.println("Positive");
		}else if(a < 0 && Math.abs(a)%2 == 1){
			System.out.println("Negative");
		} else if(a < 0 && Math.abs(a)%2 == 0){
			System.out.println("Positive");
		}
	}
}