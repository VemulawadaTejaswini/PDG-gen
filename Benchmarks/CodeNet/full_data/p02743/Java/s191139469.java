
	


import java.util.*; 
	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					long a = in.nextLong();
					long b = in.nextLong();
					long c = in.nextLong();
					
					if((Math.sqrt(a)+Math.sqrt(b))<Math.sqrt(c)) {
						System.out.println("Yes");
					}
					else {
						System.out.println("No");
					}
		
					
			}}