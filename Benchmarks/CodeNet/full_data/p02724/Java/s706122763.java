import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int x = 0, y = 0;
		
		if(X>=500){
			x = X/500;
			X -= 500*x;
        }
		if(X>=5){
			y = X/5;
			X -= 5*y;
        }

		System.out.println(1000*x+5*y);
	}
}
