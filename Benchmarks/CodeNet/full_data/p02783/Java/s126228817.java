import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws Exception {
	Scanner w = new Scanner ( System.in) ;
	int h = w.nextInt(); 
	int a = w.nextInt();
	
	int i = 0 ; 
	
	while (h>0) { 
		h-=a;
		i++;
	}
	System.out.println(i);
	}
}