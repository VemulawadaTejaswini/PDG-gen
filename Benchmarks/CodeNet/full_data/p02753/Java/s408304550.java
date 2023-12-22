import java.util.*;
public class MAIN
{ public static void main(String args[])
  { Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();int s=0;int f=0;
   int b=sc.nextInt();int i=1;
   int r=sc.nextInt();
   while(n>s)
   {for(i=1;i<=b;i++)
       { if(n>s)
           s=s+1;
         else
         break;
        }if(b==0)
         f=0;
         else
        f=f+i-1;
        for(i=1;i<=r;i++)
        { if(n>s)
            s=s+1;
            else
            break;
        }
        
   }
   System.out.println(f);
}
}
