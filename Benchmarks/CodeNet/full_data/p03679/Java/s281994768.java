import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		if (A > B){
			
			System.out.println("delicous");

		}else if(B - A > X + 1){

			System.out.println("dangerous");
		
		}else {

			System.out.println("safe");
		
		}

	}

}