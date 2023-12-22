import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int W  = keyboard.nextInt();
		int H  = keyboard.nextInt();
		int x  = keyboard.nextInt();
		int y  = keyboard.nextInt();
		
		double men = (W*H)/2.0;
		double a = x*H;
		double b = (W*H)-a;
		double c = y*W;
		double d = (W*H)-c;
		
		int hou = 0;
		
		if(a == men) {
			hou ++;
		}
		if(b == men) {
			hou ++;
		}
		if(c == men) {
			hou ++;
		}
		if(d == men) {
			hou ++;
		}

		if(hou <= 1) {
			hou = 0;
		}else {
			hou = 1;
		}

		System.out.print(men + " " + hou);
		keyboard.close();	
	}
}
