import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
			int c = sc.nextInt();
			int max = 0;
			int min = 0;
			int k = sc.nextInt();
			int ans = 0;
			
	       if(a > b && a > c){
	        	max = a;
	        	min = b+c;
	        }else if(b > a && b > c){
	        	max = b;
	        	min = a+ c;
	        }else if(c >= a && c >= b) {
	        	max = c;
	        	min = a+b;
	        }
	        
	        for(int i=0; i< k; i++){
	        	max = max * 2;
	        }	        
	        ans = max + min;
	        System.out.println(ans);
	}
}