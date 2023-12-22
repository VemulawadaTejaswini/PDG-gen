import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String s = input.next();
		int count=0;
		for(int i=0;i<n-2;i++) {
			if(s.charAt(i)=='A' && s.charAt(i+1)=='B' && s.charAt(i+2)=='C') {
				count++;
				i=i+2;
			}
		}
		
		System.out.println(count);
		
		
	}

}
