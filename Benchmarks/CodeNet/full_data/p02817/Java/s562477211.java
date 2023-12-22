import java.util.*;
public class Strings{
    public static void main(String args[])	
    Scanner scan=new Scanner(System.in);
    String s1=scan.next();
    String s2=scan.next();
	if(1>=s1.length<=100||1>=s2.length<=100){
		System.out.println("Watch out for overflows");
	}
	else
	{
		String s3=s2.concat(s1);
    	System.out.println(s3);
	}
  }
}

