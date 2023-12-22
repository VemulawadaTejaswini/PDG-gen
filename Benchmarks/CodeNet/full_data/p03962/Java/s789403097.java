import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a =in.nextInt(), b = in.nextInt(), c = in.nextInt();
		int count = 0;
		if(a!=b) {
			count++;
		}
		if(b!=c) {
			count++;
		}
		if(a!=c) {
			count++;
		}
		if(count == 3) {
			System.out.print("Three different colors: "+a+", "+b+" and "+c+".");
		}
		if(count == 2) {
			if(a==c) c = b;
			System.out.print("Two different colors: "+a+" and "+c+".");
		}
		if(count == 0) {
			System.out.print("One different color: "+a+".");
		}
		in.close();
	}
}