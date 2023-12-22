import java.util.*;

 public class Main{
   public static void main(String[] args) {
     Scanner reader=new Scanner(System.in);
     int n=reader.nextInt();
     String a=reader.next();
     int counter=0;
     int R=0;
     int B=0;
     int G=0;
    for(int j=0;j<n;j++)
    {
      if(a.charAt(j)=='R')
      R++;
      if(a.charAt(j)=='B')
      B++;
      if(a.charAt(j)=='G')
      G++;
    }

   for(int j=0;j<n;j++)
   {
     for(int i=0;i<j;i++)
     {
       if(n>2*j-i)
       {
         if(a.charAt(i)!=a.charAt(j)&&a.charAt(2*j-i)!=a.charAt(i))
         {
         if(a.charAt(j)!=a.charAt(2*j-i))
         counter++;
       }
       }
     }

   }

  System.out.println(R*B*G-counter);
    }
   }
