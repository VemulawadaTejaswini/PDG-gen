import java.util.*;
public class Main
{ public static void main(String args[])
  { Scanner sc=new Scanner (System.in);
     long n=sc.nextLong();long s=0;long f=0;
   long b=sc.nextLong();long i=1;
   long r=sc.nextLong();
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
