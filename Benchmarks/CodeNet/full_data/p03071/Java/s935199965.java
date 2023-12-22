import java.util.*;
import java.lang.Math;

public class Main {
	public static int main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
    	int a = sc.nextInt();
        int b = sc.nextInt();
      
      	if (Math.abs(a - b) > 1) {
        	return Math.max(a,b) * 2 - 1;
        } else {
        	return a + b - 1;
        }
      	
    }
}