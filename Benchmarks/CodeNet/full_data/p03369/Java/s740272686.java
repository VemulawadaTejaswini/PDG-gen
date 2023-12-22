
import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char[] arr = scan.next().toCharArray();
		int answer = 700;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'o') {
				answer = answer+100;
			}
		}
		
		System.out.println(answer);
		
	}

}
