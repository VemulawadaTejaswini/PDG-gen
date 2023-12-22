import java.io.*;
import java.util.*;
class coffee
{
  public static void main(String args[])throws IOException
  {
   String s; 
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
 		//System.out.println("Enter a string"); 
 		s = ob.readLine(); 
    if(s.length()==6)
    {
    if((s.charAt(2)==s.charAt(3)) &&(s.charAt(4)==s.charAt(5)))
       {
         System.out.println("Yes");
       }
       else
       {
         System.out.println("No");
       }
       }
       }
       }
                                                              
