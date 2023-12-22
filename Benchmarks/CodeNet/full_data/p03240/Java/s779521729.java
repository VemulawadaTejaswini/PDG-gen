import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []x = new int [n];
		int []y = new int [n];
		int []h = new int [n];
		
		for(int i = 0; i < n ; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			
		}
	 int max = 100;
	 
	  for(int px = 0; px <= max ; px++) {
		  for(int py = 0; py <= max ; py++) {
			  
			  int ph = -1;
			  for(int i = 0; i < n ; i++) {
				  if(h[i] > 0) {
					  int tmp = h[i] + Math.abs(px - x[i])+ Math.abs(py- y[i]);
					  if(ph == -1) {
						  ph = tmp;
					  }
					  else {
						  if(ph != tmp) {
							  ph = -2;
							  break;
						  }
						  
					  }
				  }
				  if(h[i] == 0) {
					  if(ph > Math.abs(px - x[i])+ Math.abs(py- y[i])) {
						  ph = -2;
						  break;
					  }
				  }
			  }
			  if(ph > 0)
				  System.out.println(px+" "+py+" "+ph);
			  if(ph == -2)
				  continue;
		  }
	  }

	

	}

}
