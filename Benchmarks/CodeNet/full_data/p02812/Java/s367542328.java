
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
		
		int i= 0;
		int count = 0;//count of ABC
		while(true) {
			if(i == s.length()-1) {
				break;
			}else {
				if(s.charAt(i) == 'A') {
					if(s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C') {
						count++;
						i=i+2;	
					}
					
				}
				i++;
			}
		}
		System.out.println(count);
	}
}	
