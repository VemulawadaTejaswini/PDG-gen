import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		
		int[]P = new int[N];
		
		for(int i = 0; i < N; i++) {
				P[i] = keyboard.nextInt();	
		}
		
		int a = 0;
		int b = 0;
		int count = 0;
		
		for(int i = 1; i < N-1; i++) {
			if(P[i-1] > P[i+1]){
				a = P[i-1];
				b = P[i+1];
			}else {
				a = P[i+1];
				b = P[i-1];
			}
			if(a > P[i] && P[i] > b) {
				count++;
			}
		}
		System.out.println(count);
		keyboard.close();	
	}
}