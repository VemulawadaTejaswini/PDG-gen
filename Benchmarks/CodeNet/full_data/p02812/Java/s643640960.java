import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
		
		
		int count = 0;//count of ABC
		for(int i=0 ;i < n-2;i++) {
			if(s.charAt(i) == 'A' && s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}	