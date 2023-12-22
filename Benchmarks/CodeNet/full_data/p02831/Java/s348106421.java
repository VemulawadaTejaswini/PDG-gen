	
	import java.util.Scanner;
	
		public class Main{
			
			public static void main(String[] args) {		
			
				Scanner sc=new Scanner(System.in);			
				long a=sc.nextInt();
				long b=sc.nextInt();				
				long ebob=1;				
				for(int i=1; i<Math.min(a, b); i++) {
					if(a%i==0 && b%i==0) {
						ebob *=i;
					}					
				}
				long ans= ((a*b)/ebob);
				System.out.println(ans);					
			}
		
	}