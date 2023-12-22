import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int sum = 1;
		char c = s.charAt(0);
		
		for (int i = 0; i < n; i++) {
			if(s.charAt(i) != c) {
				sum++;
				c = s.charAt(i);				
			}
		}
			
	
	
		System.out.println(sum);

	}
}
