import java.util.*;

public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] stick = new int[n];
		for(int i = 0; i < n; i++){
			stick[i] = scan.nextInt();
		}
		Arrays.sort(stick);
		
		long count = 0;
		for(int a = 0; a < n; a++){
			for(int b = a + 1; b < n; b++){
				int h = higherBound(stick, stick[a] + stick[b]);
				count += h - b - 1;
			}
		}
		
		System.out.println(count);
		
	}
	
	public static int higherBound(int[] array, int value){
		int left = -1;
		int right = array.length;
		while(right - left > 1){
			int mid = (left + right) / 2;
			if(array[mid] < value){
				left = mid;
			} else {
				right = mid;
			}
		}
		return right;
	}
}