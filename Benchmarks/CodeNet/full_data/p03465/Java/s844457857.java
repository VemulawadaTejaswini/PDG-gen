import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			int currentMin = arr[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (currentMin > arr[j]) {
					currentMin = arr[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				arr[currentMinIndex] = arr[i];
				arr[i] = currentMin;
			}
		}
		
		System.out.println(arr[0]+arr[1]);
		
	}
}