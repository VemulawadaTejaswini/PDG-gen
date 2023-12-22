import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int t = input.nextInt();
		System.out.println(Math.max(0, X-t));
	}
}