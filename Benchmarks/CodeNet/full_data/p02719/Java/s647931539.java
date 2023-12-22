import java.util.Scanner;

public class Main {
	
	   

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Long n = sc.nextLong();
	        Long k = sc.nextLong();
//	        int z = sc.nextInt();
	        Long result = n;
	        boolean smaller = true;
	        if(k==1) {
	        	result = 0l;
	        }else if(n % k == 0) {
	        	result =0l;
	        }
	        else {
	        while(smaller) {
	        n = Math.abs(n-k);
	        //Long temp = n;
	        result = Math.min(n, result);
	        if(result == Math.abs(Math.abs(result-k)-k)) {
	        	result = Math.abs(result-k);
	        	//smaller = false;
	        	break;
	        }
	        }
	       
	        }
	        System.out.println(result);
	        
            //System.out.println(res); 
	        
	}
}