import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int a = scanner.nextInt();
      	int b = scanner.nextInt();
      	int x = scanner.nextInt();
 
      	double answer = Math.toDegrees(Math.atan(2 * (Math.pow(a, 2) * b - Math.pow(x, 3)) / Math.pow(a, 3)));
      	System.out.println(answer);
	}
}
 

 

