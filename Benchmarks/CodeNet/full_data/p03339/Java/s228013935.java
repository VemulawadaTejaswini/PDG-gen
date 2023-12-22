import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		String N = in.nextLine();
		int a = Integer.parseInt(N);
		String b = in.nextLine();
		
		char[] c = b.toCharArray();
		int min = a;
		
		for(int i=0; i<a; i++) {
			int count = 0;
			for(int j=0; j<i; j++) {
				if(c[j]=='W') {
					count++;
				}
			}
			
			for(int j=i+1; j<a; j++) {
				
				if(c[j] == 'E') {
					count++;
				}
			}
			if(count < min) {
				min = count;
			}
		}
		System.out.print(min);
		

	
		in.close();
		
	}
}