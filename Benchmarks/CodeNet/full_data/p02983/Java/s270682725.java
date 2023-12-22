import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int L  = keyboard.nextInt();
		int R  = keyboard.nextInt();
		int x = 2019;
		
		if(R < 2019 || 2019 < L) {
			for(int i = 0; i <R-L; i++) {
				int amari = (L+i) % 2019;
				x = (amari<=x)? amari:x ;
			}
			System.out.print(x*(x+1)%2019);
		}else{
			System.out.print(0);
		}
		keyboard.close();	
	}
}
