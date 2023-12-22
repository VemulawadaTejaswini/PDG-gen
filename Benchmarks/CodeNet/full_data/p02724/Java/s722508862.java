import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 System.out.println(myFunction(a));
	}
	
	public static int myFunction(int s) {
		int total = 0;
		total += s/500 * 1000;
		s %= 1000;
		total += s/5 *5;
		
		return total;
    }
}