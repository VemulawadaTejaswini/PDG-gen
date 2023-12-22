import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[10];
		boolean ans = true;
		
		for(int i = 0; i < 4; i++){
			int n = N % 10;
			arr[n]++;
			N /= 10;
		}
		
		for(int i = 0; i < 10; i++){
			if(arr[i] >= 3){
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
}