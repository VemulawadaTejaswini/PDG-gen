import java.io.*;
import java.util.*;

public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int tempNumb = 0;
		int count = 0;
		for(int i = n; i > 0; i--){
			tempNumb = i;
			while(i % 2 == 0) {
				count++;
				i = i/2;
				//System.out.println("in loop");
			}
			
			if(count > result) {
				result = tempNumb;
			}
			count = 0;
		}
		System.out.println(result);

		sc.close();
	}
	
}