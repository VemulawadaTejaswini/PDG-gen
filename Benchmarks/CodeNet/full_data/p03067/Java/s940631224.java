import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int A,B,C;
	    
	    A=sc.nextInt();
	    B=sc.nextInt();
	    C=sc.nextInt();
	    
	    if((A<C&&C<B)||(A>C&&C>B)) {
	    	System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
	    
	    
	}
 
}