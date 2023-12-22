import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	double width = scan.nextDouble();	
      	double height = scan.nextDouble();
      	double x = scan.nextDouble();
      	double y = scan.nextDouble();
      	double yoko = 0.0;//y
      	double tate = 0.0;//x
        yoko = Math.min(width * (height - y), width * y);
      	tate = Math.min(height * (width - x), height * x);
      	System.out.print(Math.max(tate,yoko));
      	int mi = 0;
      	if(width == 2* x && height == 2* y) {
        	mi = 1;
        }
      	System.out.print(" " + mi);
    
    }
}