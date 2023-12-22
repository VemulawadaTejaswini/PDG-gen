import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int t = sc.nextInt();
	        int ci = 0;
	        
	        for(int a=1; a>=n; a++) {
	        	int c = 0;
	        	int ti = 0;
	        	c = sc.nextInt();
	        	ci = c;
	        	ti = sc.nextInt();
	        	if(ti<=t) {
	        		if(c<=ci) {
	        			ci = c;
	        			System.out.println(c);
	        		}
	        	}else {
	        		System.out.println("TLE");
	        	}
	        }
	}
}