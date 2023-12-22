import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] as = new int[n];
	        int answer = 0;
	        for (int i = 0; i < n; i++) {
	            as[i] = sc.nextInt();
	            if(i==0)
	            	answer = as[0];
	            else
	            	answer += Math.max(0, as[i] - as[i-1]);
	        }
	        
	        System.out.print(answer);
	}
}