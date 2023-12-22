import java.util.Scanner;


public class Main {
	
       public static void main(String[] args) {
    	  Scanner input=new Scanner( System.in);
    	  
    	  String string=input.next();
    	  int ans=0;
    	  for(int i=0;i<string.length()-1;i++)
    	  {
    		  if(string.charAt(i)!=string.charAt(i+1))
    		  {
    			  ans++;
    		  }
    	  }
    	  System.out.println(ans);
          
	}
}
