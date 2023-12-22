import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int width = scan.nextDouble();	
      	int height = scan.nextDouble();
      	int x = scan.nextDouble();
      	int y = scan.nextDouble();
      	int mi = 0;
      	System.out.print(width * height / 2.0);
      	if(width == 2 * x && height == 2 * y) {
        	mi = 1;
        }
      	System.out.print(" " + mi);
    
    }
 
 
}