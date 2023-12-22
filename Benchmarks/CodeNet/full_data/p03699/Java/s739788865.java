import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Integer []s = new Integer [n];
		int all = 0;
		int min = 101;
		
		for(int i = 0; i < n;i++) {
			s[i] = sc.nextInt();
			all += s[i];
			if(s[i] % 10 != 0) {
				min = Math.min(min, s[i]);
			}
		}
		
		
		if(all % 10 == 0 && min != 101) {
			all = all - min;
			System.out.println(all);
		}
		else if(all % 10 == 0 && min == 101) {
			System.out.println(0);
		}
		else {
			System.out.println(all);
		}
			
		
	}

}
