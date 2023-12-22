import java.util.*;
class Main
{
	public static void main(String[] args) 
    { 	Scanner s=new Scanner(System.in);
         String str = s.nextLine(); 
         StringBuilder input1 = new StringBuilder(); 
          StringBuilder input2 = new StringBuilder(); 
          String s1="",s2="";
          int c1,c2;
          int l=str.length();
          s1=str.substring(0,(l-1)/2);
          
          input1.append(s1);
          input2 = input1.reverse();
          
        
  
        if (input1.equals(input2)) 
        	c1=1;
            //System.out.print("Yes"); 
        else
        	c1=0;
        
       
          s2=str.substring((l-1)/2 +1,l);
          input1.append(s2);
          input2 = input1.reverse();
           
  
        if (input1.equals(input2)) 
        	c2=1;
            //System.out.print("Yes"); 
        else
        	c2=0;
            //System.out.print("No"); 

        input1.append(str);
          input2 = input1.reverse();
          
        if (input1.equals(input2) && c1==1 && c2==1 ) 
        	
            System.out.print("Yes"); 
        else
        	System.out.print("No"); 

        	
    } 
}
