import java.io.*;
import java.util.*;
import java.util.Scanner;
class coffee
{
  public static void main(String args[])throws IOException
  {
   String s; 
    int c=0;
		Scanner sc = new Scanner(System.in);
 		//System.out.println("Enter a string"); 
 		s = sc.nextLine(); 
    for(int i=0;i<6;i++)
    {
      if(s.charAt(i)>=97 && s.charAt(i)<=122)
        c=c+1;
    }
    if(s.length()==6 && c==s.length())
    {
    if((s.charAt(2)==s.charAt(3)) &&(s.charAt(4)==s.charAt(5)))
       {
         System.out.println("Yes");
       }
       
       }
	   else
       {
         System.out.println("No");
       }
       }
       }
                                                              
