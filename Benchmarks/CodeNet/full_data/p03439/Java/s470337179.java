import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
     	int i=0;
		int j=n-1;
		int mid=0;
		String z="";
		
		System.out.flush();
		System.out.println(i);			
		System.out.flush();
		String x = s.nextLine();
		if (x.equals("Vacant"))
			System.exit(0);
		
		System.out.flush();
		System.out.println(j);
		System.out.flush();
	    String y = s.nextLine();
		if (y.equals("Vacant"))
			System.exit(0);
		
				
		while(i<j-1){	
			mid = (i+j)/2;
						
			System.out.flush();
			System.out.println(mid);
			System.out.flush();
		    z = s.nextLine();
			if (z.equals("Vacant"))
				System.exit(0);

			if(i%2==mid%2){
				if(x.equals(z)){
					i=mid;	
					x=z;
				}
				else{
					j=mid;
					y=z;
				}
			}
			else{
				if(!x.equals(z)){
					i=mid;	
					x = z.equals("Male")? "Female" : "Male";
				}
				else{
					j=mid;
					y = z.equals("Male")? "Female" : "Male";
				}
			}					
			
		}	
		System.out.flush();
		System.out.println(i);
		System.out.flush();
	    z = s.nextLine();
		if (z.equals("Vacant"))
			System.exit(0);
		
		System.out.flush();
		System.out.println(mid);
		System.out.flush();
	    z = s.nextLine();
		if (z.equals("Vacant"))
			System.exit(0);
		
		System.out.flush();
		System.out.println(j);
		System.out.flush();
	    z = s.nextLine();
		if (z.equals("Vacant"))
			System.exit(0);
	}
}
