import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int cost = 0;
		if(a+b>2*c){
			int min = Math.min(x,y);
			cost += 2*c*min;
			x-=min;
			y-=min;
			if(a>2*c){
				cost+=2*c*x;
			}
			else{
				cost += a*x;
			}

			if(b>2*c){
				cost+=2*c*y;
			}
			else{
				cost += b*y;
			}
		}
		else{
			cost =cost+ a*x+b*y;
		}
		


			
		System.out.println(cost);



	}
}









