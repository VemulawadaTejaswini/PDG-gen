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
		double tate = x*H;
		double yoko = y*W;
		
		double max = 0;
		double min = 0;
		int hou = 0;
		double ans = 0;
		
		if(tate > yoko) {
			max = tate;
			min = yoko;
		}else {
			max = yoko;
			min = tate;
		}
		
		if(men == max) {
			hou++;
			}
		if(men == min) {
			hou++;
			}
		
		if(hou != 0) {
			ans = min;
			hou --;
		}else{
			ans = men;
		}

		System.out.print(ans + " " + hou);
		keyboard.close();	
	}
}
