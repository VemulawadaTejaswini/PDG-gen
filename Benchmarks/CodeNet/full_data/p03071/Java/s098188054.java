import java.util.Scanner; 
import java.lang.Math;

public class Solution {
	public static void main(String[] ars) {
    	Scanner in = new Scanner(System.in);
      	int a = in.nextInt();
      	int b = in.nextInt();
      	if (Math.abs(a - b) > 1) {
        	return Math.max(a, b) * 2 -1;
        } else {
        	return a + b;
        }
    }
}