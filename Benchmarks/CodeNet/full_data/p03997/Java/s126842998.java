import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		
		int area =(int)( 0.5f * (a + b) * h);
		
		System.out.println(area);
	}
}