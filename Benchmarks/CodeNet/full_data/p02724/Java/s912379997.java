import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int Ans = 0;	
		
		while(X>=500){
			X = X-500;
			Ans = Ans + 1000;
		}
		
		while(X>=5){
			X = X - 5;
			Ans = Ans + 5;
		}
		
		System.out.println(Ans);
	}
}