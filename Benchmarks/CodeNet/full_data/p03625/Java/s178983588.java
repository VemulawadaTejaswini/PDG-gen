import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++){
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		
		int max1 = 0, max2 = 0, index = -1;
		for(int i = N - 1; i >= 1; i--){
			if(a[i] == a[i-1] && a[i] > max1){
				max1 = a[i];
				index = i - 1;
			}else if(a[i] == a[i-1] && a[i] <= max1 && a[i] > max2 && i != index){
				max2 = a[i];
			}
		}
		
		System.out.println(max1 * max2);
	}
}
