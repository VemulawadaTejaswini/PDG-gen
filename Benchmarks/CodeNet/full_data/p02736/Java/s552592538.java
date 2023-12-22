import java.util.*;
   public class Main
    {
      public static void main(String []args)
      {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
     
          sc.nextLine();
         String s=sc.nextLine();
          
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
           
            char c=s.charAt(i);
            int b=c;
            
          a[0][i]=b-48;
        }
        for(int i=1;i<n;i++)
        {
          for(int j=0;j<n-i;j++)
          {
            a[i][j]=Math.abs(a[i-1][j]-a[i-1][j+1]);
              
          }
           
        }
        System.out.print(a[n-1][0]);
      }
    }