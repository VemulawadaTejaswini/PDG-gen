import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S = keyboard.next();
		
		String[] tile = S.split("");
		
		int center = tile.length / 2;
		int count = 0;
		
		for(int i = 1; i < center; i++) {
			int left = center - i;
			int right = center + i;
			
			if (tile[left] == tile[right]) {
				continue;
			}else{
				count ++;
			}

		}
		
		System.out.println(count);
		keyboard.close();
	}
}
