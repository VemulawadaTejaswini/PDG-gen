import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int ar[]=new int[4];
       for(int i=0;i<3;i++)
       {
           int a=sc.nextInt();
           int b=sc.nextInt();
           a-=1;
           b-=1;
           ar[a]+=1;
           ar[b]+=1;
       }
       for(int i:ar)
       {
           if(i>2)
           {
               System.out.println("NO");
               System.exit(0);
           }
       }
       System.out.println("YES");
    }
}