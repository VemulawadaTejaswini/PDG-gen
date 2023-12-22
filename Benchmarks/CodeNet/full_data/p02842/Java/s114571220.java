import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		boolean f = false;
		for(int i=0; i<50000;i++) {
			if((int)(i*1.08)==N) {
				System.out.println(i);
				f = true;
				break;
			}
		}
		if(!f) {
			System.out.println(":(");
		}
		
				
		
		
		
		
	}
}


