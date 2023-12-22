import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Long> array = new ArrayList<Long>();
		
		
		
		Long a[] = new Long[2*N-1];
		for(int i=0;i<2*N-1;i++) {
			a[i] = scan.nextLong();
			array.add(a[i]);
			
		}
		
		Collections.sort(array);
		
	/*	for(int i=0;i<N;i++) {
			for(int k=i;k<2*N-1;k++) {
				if(a[i]>a[k]) {
					int x = a[k];
					a[k] = a[i];
					a[i] = x;
					}
				
				for(int x=0;x<2*N-1;x++) {
					System.out.print(a[x]);
					
				}
				System.out.println("");
				
			}	
		}	
	*/	
	
	//System.out.println(array);
	Long answer = 	array.get(N-1);
	System.out.println(answer);


	}

}
