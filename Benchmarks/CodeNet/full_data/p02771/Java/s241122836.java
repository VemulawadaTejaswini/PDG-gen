import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;
class Main
{
		// your code goes here
		public static void main(String args[])
		{
                   // Comparator cmprtr=null;
                    int a,b,c;
                    Scanner sc= new Scanner(System.in);
                    a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
                    if(a==b && a!=c && b!=c)
                    {
                        System.out.println("Yes");
                    }
                    else if(a==c && a!=b && c!=b)
                    {
                        System.out.println("Yes");
                    }
                    else if(b==c && b!=a && c!=a)
                    {
                        System.out.println("Yes");
                    }
                   else
                    {
                        System.out.println("No");
                    }
                }}     
