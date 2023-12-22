import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int []tmpArray = array.clone();
		Arrays.sort(array);
		if(array[n-1] == array[n-2]) {
			for(int i = 0; i < n;i++) {
				System.out.println(array[n-1]);
			}
		}else {
			int index = 0;
			for(int i = 0; i < n;i++) {
				if(tmpArray[i] == array[n-1]) {
					index = i;
				}
			}
			for(int i = 0; i < n;i++) {
				if(i != index) {
					System.out.println(array[n-1]);
				}else {
					System.out.println(array[n-2]);
				}
			}
		}
	}

}