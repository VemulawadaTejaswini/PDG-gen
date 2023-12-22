import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int count = 0;
		int T = sc.nextInt();
		int[]Arr = new int[T];
		for(int i =0; i<T; i++) {
			Arr[i] = sc.nextInt();
			
		}
		
		for(int i =0; i<T; i++) {
			boolean LOL = true;
			for(int j =0; j<i; j++) {
				if(Arr[j] >Arr[i]) {
					LOL = false;
					break;
				}
				
			}
			if(LOL) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
