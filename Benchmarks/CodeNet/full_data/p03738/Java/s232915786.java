import java.util.*;

public class Main{

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		    
		   String a=sc.next();
		   String b=sc.next();
		   
		   
		  if(a.compareTo(b)>0) {
			  System.out.println("GREATER");
		  }else if(a.compareTo(b)<0) {
			  System.out.println("LESS");
		  }else {
			  System.out.println("EQUAL");
		  }

	}

}
