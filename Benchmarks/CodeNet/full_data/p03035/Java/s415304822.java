import java.lang.*;
import java.io.*;
class Main
{
public static void main(String[]args)throws IOException
{
  int A,B;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedRedaer br=new BufferedReader(isr);
System.out.print(" enter your age ");
A=Integer.parseInt(br.readLine());
System.out.print(" enter the cost b which is an even no ");
B=Integer.parseInt(br.readLine());
if(A<=5)
System.out.println(" free of cost ");
if(A>=13)
  System.out.println(" Your cost is "+B);
if(A>=6&&A<=12)
  System.out.println(" Your cost is "+B/2);
  }
}