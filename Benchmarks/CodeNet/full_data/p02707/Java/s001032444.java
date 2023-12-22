import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n - 1; i++) {
			int value = scanner.nextInt();
			arr[value - 1] += 1;
		}
		
		for(int value : arr)
			System.out.println(value);
		
 
		scanner.close();
	}
 
}