
import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		
		int x,a,b;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		int distanceA = Math.abs(x - a);
		int distanceB = Math.abs(x - b);
		
		if(distanceA > distanceB){
			System.out.println("B");
		}
		else{
			System.out.println("A");
		}
	}

}