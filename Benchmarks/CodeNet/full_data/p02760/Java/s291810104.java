import java.io.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String[]args)throws IOException
    {
         Scanner sc=new Scanner(System.in);
         int a[][]=new int[3][3];
         boolean b[][] = new boolean[3][3];
         for(int i=0;i<3;i++)
         {
              for(int j=0;j<3;j++)
              {
                   a[i][j]=sc.nextInt();
                   b[i][j]=false;
              }
         }
         int n = sc.nextInt();
         for(int i=1;i<=n;i++)
         {
              int x=sc.nextInt();
              for(int k=0;k<3;k++)
               {
                    for(int j=0;j<3;j++)
                    {
                         if(a[k][j]==x)
                         {
                             b[k][j]=true;
                             break;
                         }
                    }
               }
         }
         int flag=0;
         if(b[0][0]==true && b[1][1]==true && b[2][2]==true)
         {
               flag=1;
         }
         if(flag==0)
         {
             for(int i=0;i<3;i++)
             {
                  if(b[0][i]==true && b[1][i]==true && b[2][i]==true)
                  {
                         flag=1;
                         break;
                  }
             }
         }
      
         if(flag==0)
         {
              for(int i=0;i<3;i++)
               {
                    if(b[i][0]==true && b[i][1]==true && b[i][2]==true)
                    {
                           flag=1;
                           break;
                    }
               }
         }
          if(flag==1)
          {
               System.out.println("Yes");
          }
          else
          {
               System.out.println("No");
          }
    }
}
      
      
         
         
                
              
                        
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      