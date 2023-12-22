import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int X  = keyboard.nextInt();
		
		int[]L = new int[N];
		
		for(int i = 0; i < N; i++) {
				L[i] = keyboard.nextInt();	
		}
		
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			sum += L[i];
			if(sum < X + 1){
				if(count == N-1) {
					System.out.println(i + 2);
				}else{
					count++;
				}
			}else {
				System.out.println(i + 1);
				break;
			}
		}
		
		keyboard.close();	
	}
}