import java.util.*;
class Main
{
 public static void main(String[] args)
  {
   Scanner s = new Scanner(System.in);
   int a = s.nextInt();
   int b = s.nextInt();
   int count = 0;
   boolean value ;
       for(int i=a;i<=b;i++)
       {
           if(checkpalin(i))
           count++;
       }
       
       System.out.println(count);
   
   }
   
   public static boolean checkpalin(int val)
   {
       String line = val+"";
       int flag = 0;
       for(int j=0;j<line.length()/2;j++)
       {
           if(line.charAt(j)!= line.charAt(line.length()-1-j))
           {
               flag =1;
               break;
           }
       }
       if(flag == 0)
       return true;
       else
       return false;
   }
}
