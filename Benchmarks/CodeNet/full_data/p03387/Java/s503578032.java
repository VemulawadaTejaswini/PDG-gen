import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int [] array = new int[3];
		array[0] = stdIn.nextInt();
		array[1] = stdIn.nextInt();
		array[2] = stdIn.nextInt(); 
		int cnt = 0;
		
		while(true) {
			
			Arrays.sort(array);
			
			if(array[0] == array[1] && array[1] == array[2]) {
				break;
			}
			
			if(array[0]<array[1]) {
				cnt++;
				array[0] += 2;
				continue;
			}
			if(array[0] == array[1]) {
				cnt++;
				array[0]++;
				array[1]++;
			}
		
		}
		System.out.println(cnt);
		
	}

}
