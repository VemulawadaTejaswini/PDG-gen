import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
	
		int a= reader.nextInt();
		int b= reader.nextInt();
		int c= reader.nextInt();
	    if(a==b && b==c) {
	    	System.out.print(1);
	    }
	    if(a!=b && b!=c) {
	    	System.out.print(3);
	    	
	    }
	    else {
	    	System.out.print(2);
	    }
		
		
	}
	
	

}