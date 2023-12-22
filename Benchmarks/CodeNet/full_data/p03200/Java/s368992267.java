import java.util.*;
class Main
{
 public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);
   char[] c  =s.next().toCharArray();
   long c1=0,c2=0;
   for(int i=0;i<c.length;i++)
   {
     if(c[i]=='W')
     {
       c1+=c2;
     }
     else
     {
      	c2++;
     }
   }
   System.out.println(c1);
 }
}