import java.util.*;
class  Main
{
    public static void main (String[] args) 
    {
       Scanner sc =new Scanner(System.in); 
       System.out.println();
       int h=sc.nextInt();
       int r=sc.nextInt();
      
       for(int i=0;i<r;i++)
       {
           int z=sc.nextInt();
           h=h-z;
       }
      
       System.out.println(h);
      
       
    }
}