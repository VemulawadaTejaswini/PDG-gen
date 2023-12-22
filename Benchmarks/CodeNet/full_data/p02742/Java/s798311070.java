
	


import java.util.*; 
	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					long h = in.nextLong();
					long w = in.nextLong();
					long u = h*w;
					if(u%2 ==0) {
						System.out.println(u/2);
					}
					else if(u%2!=0){
						long y = u/2;
						System.out.println(y+1);
						
						
					}
		
					
			}}