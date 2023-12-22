import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String s = in.nextLine();
	        System.out.println(s);
	        int m=0;
	        int k=0;
	        boolean flag=false;
	        boolean flag1=false;
	        for(int i=0;i<s.length();i++)
	        {
	        	if(flag==false &&s.charAt(i)=='C')
	        	{
	        		flag=true;
	        		m=i;
	        	}
	        	if(i>m&&s.charAt(i)=='F'&&flag==true)
	        	{
	        		System.out.println("Yes");
	        		flag1=true;
	        		break;
	        	}
	        }
	        if(flag1==false)
	        System.out.println("No");
	      
	    }

	 
}


