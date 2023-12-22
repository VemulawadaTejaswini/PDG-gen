
	


import java.util.*;


	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					long a = in.nextLong();
					long b = in.nextLong();
					long c = in.nextLong();
					
					
					if((c-a-b)<0) {
						System.out.println("No");
					}
					else {
						if(((c-a-b)*(c-a-b))< 4* a* b) {
							System.out.println("No");
						}
						else {
							System.out.println("Yes");
						}
					}
		
					
			}}